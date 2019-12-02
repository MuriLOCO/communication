package ca.concordia.communication.services;

import ca.concordia.communication.enums.ObjectType;
import ca.concordia.communication.objects.Bird;
import ca.concordia.communication.objects.House;
import ca.concordia.communication.objects.Other;
import ca.concordia.communication.utils.GeneralUtils;

public class Communicate{


    public static void writeMessage(boolean objectDetected, ObjectType objectType, Bird bird, House house, Other other) {
        if (objectDetected) {
            switch (objectType) {
                case BIRD:
                    System.out.println(String.format("\nA Bird, of the species: %s, with the Object Name: %s was found at:\n Position X: %f\n Position Y: %f\n Position Z: %f\n At the Timestamp %tc", bird.getSpecie(), bird.getObjectName(), bird.getPositionX(), bird.getPositionY(), bird.getPositionZ(), bird.getTime()));
                    break;
                case HOUSE:
                    System.out.println(String.format("\nA House, of the size (in Square meters) of: %f with the Object Name: %s was found at: \n Position X: %f\n Position Y: %f\n Position Z: %f\n At the Timestamp %tc", house.getDimensionInSquareMeters(), house.getObjectName(), house.getPositionX(), house.getPositionY(), house.getPositionZ(), house.getTime()));
                    break;
                case OTHER:
                    System.out.println(String.format("\nAnother type of object was found, this object has the description of: %s. The Object Name is: %s and it was found at:\n Position X: %f\n Position Y: %f\n Position Z: %f\n At the Timestamp %tc", other.getDescription(), other.getObjectName(), other.getPositionX(), other.getPositionY(), other.getPositionZ(), other.getTime()));
                    break;
                default:
                    System.out.println("\nAn error detecting the object type has occurred.");
            }
        }else
        System.out.println(String.format("\nNo objects were detected at %tc", GeneralUtils.generateTime()));
    }
}