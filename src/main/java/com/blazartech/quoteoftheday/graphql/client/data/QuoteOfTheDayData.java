/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client.data;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author scott
 */
@Data
public class QuoteOfTheDayData {
    
    private Date runDate;
    private QuoteData quote;
}
