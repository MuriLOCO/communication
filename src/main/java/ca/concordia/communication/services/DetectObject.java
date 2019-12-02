package ca.concordia.communication.services;

import ca.concordia.communication.enums.ObjectType;
import ca.concordia.communication.objects.Bird;
import ca.concordia.communication.objects.House;
import ca.concordia.communication.objects.Other;
import ca.concordia.communication.utils.DataProvider;

public class DetectObject{

    public static void detectAndInsertObject(boolean objectDetected){
        Bird bird = new Bird();
        House house = new House();
        Other other = new Other();
        ObjectType objectType = null;
        if(objectDetected) {
            objectType = ObjectType.randomObjectType();

            switch (objectType) {
                case BIRD:
                   bird = DataProvider.generateBird();
                    break;
                case HOUSE:
                    house = DataProvider.generateHouse();
                    break;
                case OTHER:
                   other = DataProvider.generateOther();
                   break;
            }
            Communicate.writeMessage(true, objectType, bird, house, other);
        }

    }
}
