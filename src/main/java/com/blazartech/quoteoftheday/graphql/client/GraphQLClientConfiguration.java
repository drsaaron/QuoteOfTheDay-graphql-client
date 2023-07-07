/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.GraphQlClient;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

/**
 *
 * @author scott
 */
@Configuration
public class GraphQLClientConfiguration {
    
    private static final String GRAPHQL_URL = "http://localhost:30000/graphql";
    
    @Bean
    public GraphQlClient graphQLClient() {
        WebClient webClient = WebClient.create(GRAPHQL_URL);
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.create(webClient);
        return graphQlClient;
    }
}
