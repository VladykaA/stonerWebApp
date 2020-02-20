package com.stoner.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Color {
    RED,
    BLUE,
    YELLOW,
    BLACK,
    WHITE;

    private static final List<Color> COLORS = Collections.unmodifiableList(Arrays.asList(values()));
    private static final Random RANDOM = new Random();

    public static Color randomColor(){
        return COLORS.get(RANDOM.nextInt(COLORS.size()));
    }

}
