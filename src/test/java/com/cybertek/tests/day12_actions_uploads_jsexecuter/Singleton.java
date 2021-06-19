package com.cybertek.tests.day12_actions_uploads_jsexecuter;

public class Singleton {

    // we create a private constructor so someone cannot reach our object
    private Singleton() {
    }

    private static String word;

    public static String getWord() {

        if (word == null) {
            System.out.println("First time call. Word object is null." +
                    "Assigning value to it now");
            word = "something";
        } else {
            System.out.println("Word already has a value");
        }
        return word;
    }

}
