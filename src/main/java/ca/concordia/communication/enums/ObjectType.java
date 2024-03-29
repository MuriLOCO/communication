package ca.concordia.communication.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum ObjectType {
    BIRD, HOUSE, OTHER, ANIMAL, AIRPLANE;

    private static final List<ObjectType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ObjectType randomObjectType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
