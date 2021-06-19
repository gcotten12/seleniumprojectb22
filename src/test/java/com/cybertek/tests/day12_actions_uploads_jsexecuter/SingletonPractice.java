package com.cybertek.tests.day12_actions_uploads_jsexecuter;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singleton_understanding_test1() {

        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

    }
}
