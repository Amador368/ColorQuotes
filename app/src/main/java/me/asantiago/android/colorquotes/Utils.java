package me.asantiago.android.colorquotes;

import java.util.Random;

/**
 * Created by Amador on 21/11/2016.
 */

public class Utils {

    public static int generateRandomNumber(int max){
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int randomNumber = random.nextInt(max);
        return randomNumber;
    }
}
