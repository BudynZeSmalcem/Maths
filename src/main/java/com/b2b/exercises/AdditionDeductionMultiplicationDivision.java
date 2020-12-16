package com.b2b.exercises;

public class AdditionDeductionMultiplicationDivision {
    //15. Napisz program, który wyświetli wynik:
    // dodawania, odejmowania, mnożenia, dzielenia dwóch liczb podanych przez użytkownika.

    public double addition(double no1, double no2) {
        double result = no1 +no2;

        return result;
    }

    public double deduction(double no1, double no2) {
        double result = no1 -no2;
        return result;
    }

    public double multiplication(double no1, double no2) {
        double result = no1 * no2;
        return result;
    }

    public double division(double no1, double no2) {
        if (no1 == 0 || no2 == 0) {
            String result = "Do not divide by zero!";
            return Double.parseDouble(result);
        } else {
            double result = no1 / no2;
            return result;

        }
    }}