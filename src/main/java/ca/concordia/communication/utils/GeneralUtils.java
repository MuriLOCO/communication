package ca.concordia.communication.utils;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class GeneralUtils {

    public static double generateRandomDouble(){
        return (Math.random() * ((100 - 0.1) + 1)) + 0.1; //Generates a random Double with a certain range
    }

    public static Timestamp generateTime(){
        return new Timestamp(new Date().getTime());
    }

    public static UUID getRandomUUID(){
        return UUID.randomUUID();
    }

    public static boolean getRandomBoolean(){
        Random rd = new Random();
        return rd.nextBoolean();
    }
}
