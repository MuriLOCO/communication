package ca.concordia.communication.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum AnimalEnum {
    FLYING_ANIMAL, LAND_ANIMAL;

    private static final List<AnimalEnum> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static AnimalEnum randomAnimal() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
