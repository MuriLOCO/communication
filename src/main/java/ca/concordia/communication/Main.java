package ca.concordia.communication;

import ca.concordia.communication.services.DetectObject;
import ca.concordia.communication.utils.GeneralUtils;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int repetitions = GeneralUtils.generateRandomNumber();
        System.out.println("01_COMM_INITIATE_SENSORS");
        GeneralUtils.waitTimer(1000);
        System.out.println("02_COMM_DISPLAY_FLIGHT_ACTIVE");

        for(int i = 0; i < repetitions; i++){
            GeneralUtils.waitTimer(1000);
            DetectObject.detectAndInsertObject(GeneralUtils.getRandomBoolean());
            GeneralUtils.waitTimer(5000);
        }
        System.out.println("04_COMM_DEST_REACHED");
        GeneralUtils.waitTimer(1000);
        System.out.println("07_COMM_INITIATE_MANEUVER");
        GeneralUtils.waitTimer(1000);
        System.out.println("05_INITIATE_LANDING");
    }
}


