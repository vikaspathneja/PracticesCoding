package com.microsoft.azure.cosmos.sample.tester;

import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClient;
import com.azure.cosmos.CosmosClientBuilder;

public class CosmosClientFactory {
    private static final String HOST = "https://mycosmosdb2022abcd.documents.azure.com:443";
    private static final String MASTER_KEY = "j5PqFMJV1zOuva77k9ll3jJ3fq7uGpL5j6onD6U7vlCOOICUX0IZ1zDhxkmsrRGEgmLw5djlC0ue6FLsqQms5w==";

    private static CosmosClient cosmosClient = new CosmosClientBuilder()
            .endpoint(HOST)
            .key(MASTER_KEY)
            .consistencyLevel(ConsistencyLevel.EVENTUAL)
            .contentResponseOnWriteEnabled(true)
            .buildClient();

    public static CosmosClient getCosmosClient() {
        return cosmosClient;
    }

}