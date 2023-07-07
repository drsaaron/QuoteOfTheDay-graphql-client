/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client;

import com.blazartech.quoteoftheday.graphql.client.data.QuoteData;
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
public class GetQuoteCommandLineRunner implements CommandLineRunner {

    @Autowired
    private GraphQlClient graphQLClient;

    private static final String GRAPHQL_QUERY = """
                                                query {
                                                  getQuote(number: 188) {
                                                    number
                                                    usable
                                                    text
                                                    quoteOfTheDayHistory {
                                                      year
                                                      quotesOfTheDay {
                                                        runDate
                                                      }
                                                    }
                                                  }
                                                \t
                                                }""";

    @Override
    public void run(String... args) throws Exception {
        final int quoteNumber = 188;
        log.info("getting quote {}", quoteNumber);

        Mono<QuoteData> quoteMono = graphQLClient.document(GRAPHQL_QUERY)
                .retrieve("getQuote")
                .toEntity(QuoteData.class);

        log.info("got quote {}", quoteMono.block());
    }

}
