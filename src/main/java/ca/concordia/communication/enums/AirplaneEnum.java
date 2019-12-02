package ca.concordia.communication.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum AirplaneEnum {
    AIRBUS, BOEING, OTHER;

    private static final List<AirplaneEnum> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static AirplaneEnum randomAirplane() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
