package com.microsoft.azure.cosmos.sample.tester;

import com.azure.core.http.HttpResponse;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosContainer;
import com.azure.cosmos.CosmosDatabase;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.models.CosmosContainerProperties;
import com.azure.cosmos.models.CosmosContainerResponse;
import com.azure.cosmos.models.CosmosDatabaseResponse;
import com.azure.cosmos.models.CosmosItemRequestOptions;
import com.azure.cosmos.models.CosmosItemResponse;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.PartitionKey;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpStatusClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DocDbDao {
    // The name of our database.
    private static final String DATABASE_ID = "TestDB";

    // The name of our collection.
    private static final String CONTAINER_ID = "TestCollection";

    // We'll use Gson for POJO <=> JSON serialization for this example.
    private static Gson gson = new Gson();

    // The Cosmos DB Client
    private static CosmosClient cosmosClient = CosmosClientFactory
        .getCosmosClient();

    // The Cosmos DB database
    private static CosmosDatabase cosmosDatabase = null;

    // The Cosmos DB container
    private static CosmosContainer cosmosContainer = null;

    // For POJO/JsonNode interconversion
    private static final ObjectMapper OBJECT_MAPPER = Utils.getSimpleObjectMapper();

    static HashMap<Integer, String> hm = new HashMap<>();
	static int todoItemCounter=1;
	static int getLastTodoIndex(){
		return todoItemCounter;
	}
	
	public static TodoItem convertJsonNodeToObject(JsonNode node) throws JsonProcessingException, IllegalArgumentException{
		return OBJECT_MAPPER.treeToValue(node, TodoItem.class);
	}
	public static JsonNode convertObjecttoJsonNode(TodoItem item) throws JsonProcessingException, IllegalArgumentException{
		return OBJECT_MAPPER.valueToTree(item);
	}
	static String getTodoItem(int itemIndex){
		return hm.get(itemIndex); 
	}
	 public TodoItem createTodo(String todoItem) throws JsonMappingException, JsonProcessingException{
		 	TodoItem item=new TodoItem(todoItem, todoItem);
	        JsonNode todoItemJson = OBJECT_MAPPER.valueToTree(item);
//	        TodoItem dataRetrievedFromCosmosDb=null;
	        CosmosItemResponse<JsonNode> cosmosItemresponse=null;
		 try {
	            // Persist the document using the DocumentClient.
			 cosmosItemresponse =
	                getContainerCreateResourcesIfNotExist()
	                    .createItem(todoItemJson);
			 System.out.println("status code of create item:="+cosmosItemresponse.getStatusCode());
			 if(cosmosItemresponse.getStatusCode()==HttpResponseStatus.CREATED.code())
			 System.out.println("TodoItem Created:"+cosmosItemresponse.getItem());
			 return convertJsonNodeToObject(cosmosItemresponse.getItem());
//			 dataRetrievedFromCosmosDb=getDocumentById(todoItem);
//			 System.out.println(dataRetrievedFromCosmosDb);
	        } catch (CosmosException e) {
	            System.out.println("Error creating TODO item.\n");
	            e.printStackTrace();
	            return null;
	        }
	}
	
	 public TodoItem updateTodoItem(String id,String updatedContent) throws JsonProcessingException, IllegalArgumentException {
	        // Retrieve the document from the database
	        TodoItem todoItemJson = getDocumentById(id);
	        todoItemJson.setName(updatedContent);
	   	JsonNode jsonNode=OBJECT_MAPPER.valueToTree(todoItemJson);
	        try {
	            // Persist/replace the updated document.
	               return convertJsonNodeToObject(getContainerCreateResourcesIfNotExist()
	                    .replaceItem(jsonNode, id, new PartitionKey(id), new CosmosItemRequestOptions()).getItem());
	        } catch (CosmosException e) {
	            System.out.println("Error updating TODO item.\n");
	            e.printStackTrace();
	            return null;
	        }

//	        return getDocumentById(id);
	    }
	 
	 public static CosmosItemRequestOptions getCosmosItemRequestOptions(){
		 CosmosItemRequestOptions requestOption=new CosmosItemRequestOptions();
		 requestOption.setContentResponseOnWriteEnabled(true);
		 return requestOption;
	 }
	 public TodoItem deleteToDo(String id) throws JsonProcessingException, IllegalArgumentException {
	        // Retrieve the document from the database
	        TodoItem todoItemJson = getDocumentById(id);
	        JsonNode node= OBJECT_MAPPER.valueToTree(todoItemJson);
	        try {
	            // Persist/replace the updated document.
	        	CosmosItemResponse<Object> cosmosItemresponse=null;
	        	cosmosItemresponse=getContainerCreateResourcesIfNotExist().deleteItem(node,new CosmosItemRequestOptions());
	            System.out.print("Todo Deleted: ");
	            System.out.print(cosmosItemresponse.getStatusCode()==HttpResponseStatus.NO_CONTENT.code());
	            System.out.println();
	            return todoItemJson;
	        } catch (CosmosException e) {
	            System.out.println("Error Deletion TODO item.\n");
	            e.printStackTrace();
	            return null;
	        }

//	        return getDocumentById(id);
	    }

    private CosmosContainer getContainerCreateResourcesIfNotExist() {

        try {

            if (cosmosDatabase == null) {
                CosmosDatabaseResponse cosmosDatabaseResponse = cosmosClient.createDatabaseIfNotExists(DATABASE_ID);
                cosmosDatabase = cosmosClient.getDatabase(cosmosDatabaseResponse.getProperties().getId());
            }

        } catch (CosmosException e) {
            // TODO: Something has gone terribly wrong - the app wasn't
            // able to query or create the collection.
            // Verify your connection, endpoint, and key.
            System.out.println("Something has gone terribly wrong - " +
                "the app wasn't able to create the Database.\n");
            e.printStackTrace();
        }

        try {

            if (cosmosContainer == null) {
                CosmosContainerProperties properties = new CosmosContainerProperties(CONTAINER_ID, "/id");
                CosmosContainerResponse cosmosContainerResponse = cosmosDatabase.createContainerIfNotExists(properties);
                cosmosContainer = cosmosDatabase.getContainer(cosmosContainerResponse.getProperties().getId());
            }

        } catch (CosmosException e) {
            // TODO: Something has gone terribly wrong - the app wasn't
            // able to query or create the collection.
            // Verify your connection, endpoint, and key.
            System.out.println("Something has gone terribly wrong - " +
                "the app wasn't able to create the Container.\n");
            e.printStackTrace();
        }

        return cosmosContainer;
    }

    TodoItem getDocumentById(String id) throws JsonProcessingException, IllegalArgumentException {

        String sql = "SELECT * FROM root r WHERE r.id='" + id + "'";
        int maxItemCount = 1000;
        int maxDegreeOfParallelism = 1000;
        int maxBufferedItemCount = 100;

        CosmosQueryRequestOptions options = new CosmosQueryRequestOptions();
        options.setMaxBufferedItemCount(maxBufferedItemCount);
        options.setMaxDegreeOfParallelism(maxDegreeOfParallelism);
        options.setQueryMetricsEnabled(false);

        List<JsonNode> itemList = new ArrayList();

        String continuationToken = null;
        do {
            for (FeedResponse<JsonNode> pageResponse :
                getContainerCreateResourcesIfNotExist()
                    .queryItems(sql, options, JsonNode.class)
                    .iterableByPage(continuationToken, maxItemCount)) {

                continuationToken = pageResponse.getContinuationToken();

                for (JsonNode item : pageResponse.getElements()) {
                    itemList.add(item);
                }
            }

        } while (continuationToken != null);

        if (itemList.size() > 0) {
            return OBJECT_MAPPER.treeToValue(itemList.get(0),TodoItem.class);
        } else {
            return null;
        }
    }

}