/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client.data;

import java.util.List;
import lombok.Data;

/**
 *
 * @author scott
 */
@Data
public class QuoteOfTheDayHistoryData {
    
    private int year;
    private List<QuoteOfTheDayData> quotesOfTheDay;
}
