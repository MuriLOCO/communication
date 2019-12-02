package ca.concordia.communication;

import ca.concordia.communication.services.DetectObject;
import ca.concordia.communication.utils.GeneralUtils;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            DetectObject.detectAndInsertObject(GeneralUtils.getRandomBoolean());
            Thread.sleep(5000);
        }
    }
}


