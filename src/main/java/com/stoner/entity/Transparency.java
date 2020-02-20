package com.stoner.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public enum Transparency {
    LOW(1, 25),
    WEAK(26,50),
    GOOD(51, 75),
    EXCELLENT(76, 100);

    private int valueFrom;
    private int valueTo;

    private static final List<Transparency> TRANSPARENCIES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();

    Transparency(int valueFrom, int valueTo) {
        this.valueFrom = valueFrom;
        this.valueTo = valueTo;
    }

    public static Stream<Transparency> stream(){
        return Stream.of(Transparency.values());
    }

    public static Transparency randomTransparency(){
        return TRANSPARENCIES.get(RANDOM.nextInt(TRANSPARENCIES.size()));
    }

}
