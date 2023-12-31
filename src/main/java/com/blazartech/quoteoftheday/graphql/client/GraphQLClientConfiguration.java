/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client;

import org.springframework.beans.factory.annotation.Value;
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
    
    @Value("${demo.graphql.url}")
    private String graphqlURL;
    
    @Bean
    public GraphQlClient graphQLClient() {
        WebClient webClient = WebClient.create(graphqlURL);
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.create(webClient);
        return graphQlClient;
    }
}
