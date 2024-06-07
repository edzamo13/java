package com.reactive.programming.udemy.reactive.section7;

import com.reactive.programming.udemy.reactive.section7.exampleMethod.Stock;
import com.reactive.programming.udemy.reactive.section7.exampleMethod.StockFilters;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {

    public static void main(String[] args) {
        List<Stock> stockList = new ArrayList<>();

        stockList.add(new Stock("Appl", 10.2, 1));
        stockList.add(new Stock("MSF", 10.2, 1));
        stockList.add(new Stock("APPLE", 10.2, 12));
        stockList.add(new Stock("GOOGLE", 10.2, 1));

       // StockFilters.bySymbol(stockList,"MSF").forEach( stock -> System.out.println(stock.toString()));

        StockFilters.filter(stockList, stock -> stock.getAmount().equals(1)).forEach(System.out::println);
    }

}
