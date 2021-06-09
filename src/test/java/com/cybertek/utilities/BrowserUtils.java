package com.cybertek.utilities;

public class BrowserUtils {

    /*
    Method that will accept int
    Wait for given second duration
     */

    public static void sleep(int seconds) {
        seconds*=1000;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
