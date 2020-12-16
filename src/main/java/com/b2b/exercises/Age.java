package com.b2b.exercises;

public class Age {
    //13. Napisz program, w którym użytkownik podaje swój wiek,
    // a następnie program wyświetli komunikat czy użytkownik jest osobą pełnoletnią.

    public String age(int age) {
        try {
            age = Integer.parseInt("");
        }
            catch (NumberFormatException e) {
//                return "parametr age musi byc cyfrą";
        }
        String result = "";
        if (age >= 18) {
            result = "You are adult:-)";

        } else if (age < 0) {
            result = "There is no age like this";
        }
        else {
            result = "You are not adult";
        }
            return result;
        }

    }



