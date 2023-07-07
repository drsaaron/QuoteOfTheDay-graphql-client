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
public class QuoteData {
    
    private int number;
    private String text;
    private boolean usable;
    private List<QuoteOfTheDayHistoryData> quoteOfTheDayHistory;
}
