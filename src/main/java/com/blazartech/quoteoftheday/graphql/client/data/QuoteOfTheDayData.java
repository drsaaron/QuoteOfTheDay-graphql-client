/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client.data;

import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author scott
 */
@Data
public class QuoteOfTheDayData {
    
    private LocalDate runDate;
    private QuoteData quote;
}
