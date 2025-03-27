/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blazartech.quoteoftheday.graphql.client.data;

import java.util.List;

/**
 *
 * @author scott
 */
public class QuoteOfTheDayHistoryData {
    
    private int year;
    private List<QuoteOfTheDayData> quotesOfTheDay;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<QuoteOfTheDayData> getQuotesOfTheDay() {
        return quotesOfTheDay;
    }

    public void setQuotesOfTheDay(List<QuoteOfTheDayData> quotesOfTheDay) {
        this.quotesOfTheDay = quotesOfTheDay;
    }

    @Override
    public String toString() {
        return "QuoteOfTheDayHistoryData{" + "year=" + year + ", quotesOfTheDay=" + quotesOfTheDay + '}';
    }
    
    
}
