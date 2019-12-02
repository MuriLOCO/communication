package ca.concordia.communication.utils;

import ca.concordia.communication.enums.BirdEnum;
import ca.concordia.communication.objects.Bird;
import ca.concordia.communication.objects.House;
import ca.concordia.communication.objects.Other;

import java.util.UUID;

public class DataProvider {

    private static final String BIRD = "bird";
    private static final String HOUSE = "house";
    private static final String OTHER = "other";

    private static final String DEFAULT_DESCRIPTION = "Unidentified Object";

    public static Bird generateBird() {
        Bird bird = new Bird();
        bird.setId(GeneralUtils.getRandomUUID());
        bird.setPositionX(GeneralUtils.generateRandomDouble());
        bird.setPositionY(GeneralUtils.generateRandomDouble());
        bird.setPositionZ(GeneralUtils.generateRandomDouble());
        bird.setSpecie(BirdEnum.randomBird());
        bird.setObjectName(BIRD);
        bird.setTime(GeneralUtils.generateTime());
        return bird;
    }

    public static House generateHouse(){
        House house = new House();
        house.setId(UUID.randomUUID());
        house.setPositionX(GeneralUtils.generateRandomDouble());
        house.setPositionY(GeneralUtils.generateRandomDouble());
        house.setPositionZ(GeneralUtils.generateRandomDouble());
        house.setDimensionInSquareMeters(GeneralUtils.generateRandomDouble());
        house.setObjectName(HOUSE);
        house.setTime(GeneralUtils.generateTime());
        return house;
    }

    public static Other generateOther(){
        Other other = new Other();
        other.setId(UUID.randomUUID());
        other.setPositionX(GeneralUtils.generateRandomDouble());
        other.setPositionY(GeneralUtils.generateRandomDouble());
        other.setPositionZ(GeneralUtils.generateRandomDouble());
        other.setDescription(DEFAULT_DESCRIPTION);
        other.setObjectName(OTHER);
        other.setTime(GeneralUtils.generateTime());
        return other;
    }

}
