package com.microsoft.azure.cosmos.sample.tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.FeedResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

public class CosmoDbCrudTester {
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		DocDbDao pushtoCosmosdb=new DocDbDao();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter function type: add/update/delete/get");
			String functionType=sc.next();
			if(functionType.equalsIgnoreCase("add")) {
				System.out.println("Enter todo item to add:");
				TodoItem todoItem=pushtoCosmosdb.createTodo(sc.next());
				System.out.println(todoItem!=null?"Success":"Failure");
			}
			else if(functionType.equalsIgnoreCase("update")) {
				System.out.println("Enter todoitem index and updated todoitem content");
				System.out.println(pushtoCosmosdb.updateTodoItem(sc.next(), sc.next())!=null?"Success":"Failure");
			}
			else if(functionType.equalsIgnoreCase("delete")) {
				System.out.println("Enter todoitem index to delete todo");
				System.out.println(pushtoCosmosdb.deleteToDo(sc.next())!=null?"Success":"Failure");
			}
			else {
				System.out.println("Enter todoitem index to retrieve todo");
				System.out.println(pushtoCosmosdb.getDocumentById(sc.next()));
			}
		}
	}
	


}
