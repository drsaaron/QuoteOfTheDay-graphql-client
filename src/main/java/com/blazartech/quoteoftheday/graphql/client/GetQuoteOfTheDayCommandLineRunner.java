/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client;

import com.blazartech.quoteoftheday.graphql.client.data.QuoteOfTheDayData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.graphql.client.GraphQlClient;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 *
 * @author scott
 */
@Component
@Slf4j
public class GetQuoteOfTheDayCommandLineRunner implements CommandLineRunner {

    @Autowired
    private GraphQlClient graphQLClient;
    
    private static final String GRAPHQL_QUERY = """
                                         query {
                                           getQuoteOfTheDay(runDate: "2023-07-06") {
                                             number
                                             runDate
                                             quote {
                                               number
                                               text
                                               usable
                                               quoteOfTheDayHistory {
                                                 year
                                                 quotesOfTheDay {
                                                   runDate
                                                 }
                                               }
                                             }
                                           }
                                         	
                                         }
                                         """;
    
    @Override
    public void run(String... args) throws Exception {
        
        log.info("getting quote of the day");

        Mono<QuoteOfTheDayData> quoteMono = graphQLClient.document(GRAPHQL_QUERY)
                .retrieve("getQuoteOfTheDay")
                .toEntity(QuoteOfTheDayData.class);

        log.info("got quote of the day {}", quoteMono.block());
    }
    
}
