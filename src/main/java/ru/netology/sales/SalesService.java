package ru.netology.sales;

public class SalesService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public long averageSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthOfMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthOfMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthSalesLowerAver(long[] sales) {
        long avr = averageSumSales(sales);
        int countMonth = 0;
        for (long i : sales) {
            if (i < avr) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int countMonthSalesUpAver(long[] sales) {
        long avr = averageSumSales(sales);
        int countMonth = 0;
        for (long i : sales) {
            if (i > avr) {
                countMonth++;
            }
        }
        return countMonth;
    }
}