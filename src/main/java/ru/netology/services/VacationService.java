package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                // отдых
                balance -= expenses;
                balance /= 3;
                count++;
            } else {
                // работа
                balance += income;
                balance -= expenses;
            }
        }
        return count;
    }
}