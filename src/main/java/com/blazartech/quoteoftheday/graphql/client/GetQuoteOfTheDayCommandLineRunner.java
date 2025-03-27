/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client;

import com.blazartech.quoteoftheday.graphql.client.data.QuoteOfTheDayData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class GetQuoteOfTheDayCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(GetQuoteOfTheDayCommandLineRunner.class);
    
    @Autowired
    private GraphQlClient graphQLClient;
    
    private static final String GRAPHQL_QUERY = """
                                         query($runDate: Date!) {
                                           getQuoteOfTheDay(runDate: $runDate) {
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
                .variable("runDate", "2023-07-05")
                .retrieve("getQuoteOfTheDay")
                .toEntity(QuoteOfTheDayData.class);

        log.info("got quote of the day {}", quoteMono.block());
    }
    
}
