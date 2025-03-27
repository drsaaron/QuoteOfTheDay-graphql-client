/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client.data;

import java.time.LocalDate;

/**
 *
 * @author scott
 */
public class QuoteOfTheDayData {
    
    private LocalDate runDate;
    private QuoteData quote;

    public LocalDate getRunDate() {
        return runDate;
    }

    public void setRunDate(LocalDate runDate) {
        this.runDate = runDate;
    }

    public QuoteData getQuote() {
        return quote;
    }

    public void setQuote(QuoteData quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "QuoteOfTheDayData{" + "runDate=" + runDate + ", quote=" + quote + '}';
    }
    
    
}
