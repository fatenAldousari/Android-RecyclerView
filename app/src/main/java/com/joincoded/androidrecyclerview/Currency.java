package com.joincoded.androidrecyclerview;

public class Currency{



   private String currencyCode;
   private double exchangeRate;
   private String currencyName;

    public Currency(String currencyCode, double exchangeRate, String currencyName) {
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
