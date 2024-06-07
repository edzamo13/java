package ec.udemy.section7.exampleMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

    public static List<Stock> bySymbol(List<Stock> lists, String symbol) {

        List<Stock> filterData = new ArrayList<>();
        for (Stock s : lists) {
            if (s.getName().equals(symbol))
                filterData.add(s);
        }
        return filterData;
    }

    public static List<Stock> filter(List<Stock> stocks, Predicate<Stock> predicate) {
        List<Stock> stockList = new ArrayList<>();
        for (Stock s : stocks) {
            if (predicate.test(s))
                stockList.add(s);
        }
        return stockList;
    }
}
