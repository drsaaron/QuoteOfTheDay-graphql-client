/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.blazartech.quoteoftheday.graphql.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author scott
 */
@SpringBootApplication
@ComponentScan("com.blazartech")
public class QuoteOfTheDayGraphqlClient {

    public static void main(String[] args) {
        SpringApplication.run(QuoteOfTheDayGraphqlClient.class, args);
    }
}
