package com.b2b.exercises;

public class BiggerNumber {
    //9. Napisz program, który wyświetli liczbę większą spośród dwóch liczb podanych przez użytkownika.

    public String biggerNumber(int number1, int number2) {
        String result;
        if (number1 > number2)
        {
             result = String.valueOf(number1);
        } else if (number2 > number1) {
             result = String.valueOf(number2);
        } else {
            result = "equals";
        }
        return result;
    }
}
