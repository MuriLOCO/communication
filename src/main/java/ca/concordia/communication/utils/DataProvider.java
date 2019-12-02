package ca.concordia.communication.utils;

import ca.concordia.communication.enums.AirplaneEnum;
import ca.concordia.communication.enums.AnimalEnum;
import ca.concordia.communication.enums.BirdEnum;
import ca.concordia.communication.objects.*;

public class DataProvider {

    private static final String BIRD = "bird";
    private static final String HOUSE = "house";
    private static final String OTHER = "other";
    private static final String ANIMAL = "animal";
    private static final String AIRPLANE = "airplane";

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
        house.setId(GeneralUtils.getRandomUUID());
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
        other.setId(GeneralUtils.getRandomUUID());
        other.setPositionX(GeneralUtils.generateRandomDouble());
        other.setPositionY(GeneralUtils.generateRandomDouble());
        other.setPositionZ(GeneralUtils.generateRandomDouble());
        other.setDescription(DEFAULT_DESCRIPTION);
        other.setObjectName(OTHER);
        other.setTime(GeneralUtils.generateTime());
        return other;
    }

    public static Animal generateAnimal(){
        Animal animal = new Animal();
        AnimalEnum animalEnum = AnimalEnum.randomAnimal();
        if(animalEnum == AnimalEnum.FLYING_ANIMAL)
            animal.setPositionZ(GeneralUtils.generateRandomDouble());
        else
            animal.setPositionZ(0.0);

        animal.setAnimalType(AnimalEnum.randomAnimal());
        animal.setId(GeneralUtils.getRandomUUID());
        animal.setPositionX(GeneralUtils.generateRandomDouble());
        animal.setPositionY(GeneralUtils.generateRandomDouble());
        animal.setObjectName(ANIMAL);
        animal.setTime(GeneralUtils.generateTime());
        return animal;
    }

    public static Airplane generateAirplaine(){
        Airplane airplane = new Airplane();
        airplane.setId(GeneralUtils.getRandomUUID());
        airplane.setPositionX(GeneralUtils.generateRandomDouble());
        airplane.setPositionY(GeneralUtils.generateRandomDouble());
        airplane.setPositionZ(GeneralUtils.generateRandomDouble());
        airplane.setSize(GeneralUtils.generateRandomDouble());
        airplane.setAirplaneType(AirplaneEnum.randomAirplane());
        airplane.setObjectName(AIRPLANE);
        airplane.setTime(GeneralUtils.generateTime());
        return airplane;
    }

}
