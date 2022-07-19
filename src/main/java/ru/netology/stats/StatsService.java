package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {  // общие продажи
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSum(long[] sales) {   // среднее за год
        return sum(sales) / 12;
    }

    public int minSales(long[] sales) {  // месяц с минимальной продажей
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {  // месяц с максимальной продажей
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int avgLess(long[] sales) { // Кол-во месяцев, в которых продажи были ниже среднего
        long avg = averageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int avgAbove(long[] sales) { // Кол-во месяцев, в которых продажи были выше среднего
        long avg = averageSum(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}

