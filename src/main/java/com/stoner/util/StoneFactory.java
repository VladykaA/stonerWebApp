package com.stoner.util;

import com.stoner.entity.Color;
import com.stoner.entity.Stone;
import com.stoner.entity.Transparency;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.IntStream;

public class StoneFactory {

    public static final Random RANDOM = new Random();
    private static int indexLanguage = 0;

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

    private static final Locale[] SUPPORTED_LOCALES = {
            Locale.ENGLISH,
            Locale.forLanguageTag("ua")
    };

    public static ResourceBundle getLabels() {
        return ResourceBundle.getBundle("LabelsBundle", SUPPORTED_LOCALES[indexLanguage]);
    }

    public static void setIndexLanguage(int indexLanguage) {
        StoneFactory.indexLanguage = indexLanguage;
    }

    public static int getIndexLanguage() {
        return indexLanguage;
    }

    public static String getName() {

        return getLabels().getString(NAMES[RANDOM.nextInt(NAMES.length)]);
    }

    public static Stone getRandomStone() {
        return getStone();
    }

    private static BigDecimal getRandomNum(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Wrong input");
        }
        return new BigDecimal(RANDOM.nextInt((max - min) + 1) + min);
    }

    private static Stone setStone(Stone stone) {
        String name = stone.getName();
        switch (name) {
            case "Diamond":
            case "Sapphire":
            case "Ruby":
            case "Emerald":
            case "Topaz":
                stone.setType(getLabels().getString("gemstone.type"));
                break;
            default:
                stone.setType(getLabels().getString("semiprecious.type"));
        }
        return stone;
    }

    private static Stone getStone() {
        return setStone(new Stone(getName(), getRandomNum(10, 100), getRandomNum(1, 10),
                Transparency.randomTransparency(), Color.randomColor()));
    }
}
