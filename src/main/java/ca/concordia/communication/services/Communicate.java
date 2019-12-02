package ca.concordia.communication.services;

import ca.concordia.communication.enums.ObjectType;
import ca.concordia.communication.objects.*;
import ca.concordia.communication.utils.GeneralUtils;

public class Communicate{


    public static void writeMessage(boolean objectDetected, ObjectType objectType, Bird bird, House house, Other other, Animal animal, Airplane airplane) {
        if (objectDetected) {
            switch (objectType) {
                case BIRD:
                    System.out.println(String.format("\n\n03_COMM_SHARP_SIGNAL\n**Send sharp signal to cause bird to move away!**\nA Bird, of the species: %s, with the Object Name: %s was found at:\nPosition X: %f\nPosition Y: %f\nPosition Z: %f\nAt the Timestamp %tc", bird.getSpecie(), bird.getObjectName(), bird.getPositionX(), bird.getPositionY(), bird.getPositionZ(), bird.getTime()));
                    break;
                case HOUSE:
                    System.out.println(String.format("\n\n06_COMM_OBJECT_DETECTED\n**Send STOP signal to flying system!**\nA House, of the size (in Square meters) of: %f with the Object Name: %s was found at: \nPosition X: %f\nPosition Y: %f\nPosition Z: %f\nAt the Timestamp %tc", house.getDimensionInSquareMeters(), house.getObjectName(), house.getPositionX(), house.getPositionY(), house.getPositionZ(), house.getTime()));
                    break;
                case OTHER:
                    System.out.println(String.format("\n\n06_COMM_OBJECT_DETECTED\nAnother type of object was found, this object has the description of: %s. The Object Name is: %s and it was found at:\nPosition X: %f\nPosition Y: %f\nPosition Z: %f\nAt the Timestamp %tc", other.getDescription(), other.getObjectName(), other.getPositionX(), other.getPositionY(), other.getPositionZ(), other.getTime()));
                    break;
                case ANIMAL:
                    System.out.println(String.format("\n\n06_COMM_OBJECT_DETECTED\nAnimal of type: %s was found. Object name: %s, \nPosition X: %f \nPosition Y: %f \nPosition Z: %f \nAt the Timestamp %tc", animal.getAnimalType(), animal.getObjectName(), animal.getPositionX(), animal.getPositionY(), animal.getPositionZ(), animal.getTime()));
                    break;
                case AIRPLANE:
                    System.out.println(String.format("\n\n06_COMM_OBJECT_DETECTED\nAirplane of type %s and size %f was found at \nPosition X: %f\nPosition Y: %f\nPosition Z: %f\nAt the Timestamp %tc", airplane.getAirplaneType(), airplane.getSize(), airplane.getPositionX(), airplane.getPositionY(), airplane.getPositionZ(), airplane.getTime()));
                    break;
                default:
                    System.out.println("\n\nAn error detecting the object type has occurred.");
            }
        }else
        System.out.println(String.format("\n\nNo objects were detected at %tc", GeneralUtils.generateTime()));
    }
}
