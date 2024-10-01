package ru.netology.sales;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void calcSumSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcAverSumSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthMaxSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthOfMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthMinSales() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.monthOfMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMonthLowerAver() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthSalesLowerAver(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMonthUpAver() {
        SalesService service = new SalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthSalesUpAver(sales);

        Assertions.assertEquals(expected, actual);
    }
}