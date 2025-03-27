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
public class QuoteData {
    
    private int number;
    private String text;
    private boolean usable;
    private List<QuoteOfTheDayHistoryData> quoteOfTheDayHistory;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    public List<QuoteOfTheDayHistoryData> getQuoteOfTheDayHistory() {
        return quoteOfTheDayHistory;
    }

    public void setQuoteOfTheDayHistory(List<QuoteOfTheDayHistoryData> quoteOfTheDayHistory) {
        this.quoteOfTheDayHistory = quoteOfTheDayHistory;
    }

    @Override
    public String toString() {
        return "QuoteData{" + "number=" + number + ", text=" + text + ", usable=" + usable + ", quoteOfTheDayHistory=" + quoteOfTheDayHistory + '}';
    }
    
    
}
