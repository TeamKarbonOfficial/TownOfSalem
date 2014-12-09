package com.teamkarbon.android.townofsalem;

import java.util.Random;

/**
 * Created by Joe on 10/12/2014.
 */
public class Extras {

    private static int number;
    private static boolean showads;
    private final static int MIN = 1;
    //Max determine, the probability. eg. 1/30
    private final static int MAX = 30;

    protected static boolean randomads() {
        number = randomInt(MIN, MAX);

        if (number == 1)
            showads = true;
        else
            showads = false;

        return showads;
    }

    protected static int randomInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
