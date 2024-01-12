package ru.netology.sales.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {

    @Test

    public void testSum () {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatisticService service = new StatisticService();

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void TestAvgSumInMonth () {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatisticService service = new StatisticService();

        long expected = ( 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18 ) / 12;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMaxSum () {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatisticService service = new StatisticService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMinSum () {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatisticService service = new StatisticService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testLessThanAvg () {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatisticService service = new StatisticService();

        long expected = 5;
        long actual = service.lessThanAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMoreThanAvg () {
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatisticService service = new StatisticService();

        long expected = 5;
        long actual = service.moreThanAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
