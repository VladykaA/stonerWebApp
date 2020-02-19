package com.stoner.util;

import com.stoner.entity.Color;
import com.stoner.entity.Stone;
import com.stoner.entity.Transparency;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.IntStream;

public class StoneFactory {

    public static final Random RANDOM = new Random();

    private final static String[] NAMES = {
            "gemstone.diamond.name",
            "gemstone.sapphire.name",
            "gemstone.ruby.name",
            "gemstone.emerald.name",
            "gemstone.topaz.name",
            "semiprecious.jade.name",
            "semiprecious.malachite.name",
            "semiprecious.amber.name",
            "semiprecious.onyx.name",
            "semiprecious.aquamarine.name"
    };

    Locale[] supportedLocales = {
            Locale.ENGLISH,
            Locale.forLanguageTag("ua")
    };

    ResourceBundle labels = ResourceBundle.getBundle("LabelsBundle", supportedLocales[0]);

    public static String getName(ResourceBundle labels){
        Enumeration bundleKeys = labels.getKeys();
        String value = "";
        while (bundleKeys.hasMoreElements()){
            String key = (String) bundleKeys.nextElement();
            value = labels.getString(key);
        }
        return value;
    }
    
    private static Stone[] stones;

    static {
        stones = new Stone[10];
        IntStream.range(0, stones.length).forEach(i -> stones[i] = getStone());
    }

    private static Stone getStone() {
        return setStone(new Stone(NAMES[RANDOM.nextInt(NAMES.length)],
                new BigDecimal(getRandomNum(10, 100)), new BigDecimal(getRandomNum(1, 10)),
                Transparency.randomTransparency(), Color.randomColor()));
    }

    public static Stone getRandomStone() {
        int index = RANDOM.nextInt(stones.length);
        return stones[index];
    }

    private static int getRandomNum(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException();
        }
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    private static Stone setStone(Stone stone) {
        String name = stone.getName();
        switch (name) {
            case "Diamond":
            case "Sapphire":
            case "Ruby":
            case "Emerald":
            case "Topaz":
                stone.setType("gemstone.type");
                break;
            default:
                stone.setType("semiprecious.type");
        }
        return stone;
    }
}
