package ca.concordia.communication.services;

import ca.concordia.communication.enums.ObjectType;
import ca.concordia.communication.objects.*;
import ca.concordia.communication.utils.DataProvider;

public class DetectObject{

    public static void detectAndInsertObject(boolean objectDetected){
        Bird bird = new Bird();
        House house = new House();
        Other other = new Other();
        Animal animal = new Animal();
        Airplane airplane = new Airplane();
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
                case ANIMAL:
                    animal = DataProvider.generateAnimal();
                    break;
                case AIRPLANE:
                    airplane = DataProvider.generateAirplaine();
                    break;
            }
        }
        Communicate.writeMessage(objectDetected, objectType, bird, house, other, animal, airplane);

    }
}
