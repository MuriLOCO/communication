package ca.concordia.communication.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum BirdEnum {
    MOURNING_DOVE, RED_BILLED_QUELE, DOMESTIC_CHICKEN, AMERICAN_ROBIN, COMMON_PHEASANT, RED_WINGED_BLACKBIRD, CHIPPING_SPARROW, COMMON_STARLING, COMMON_SWIFT, YELLOE_RUMPED_WARBLER;

    private static final List<BirdEnum> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static BirdEnum randomBird() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}