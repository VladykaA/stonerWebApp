package com.stoner.util;

import com.stoner.entity.Chain;
import com.stoner.entity.Color;

import java.math.BigDecimal;
import java.util.Random;
import java.util.stream.IntStream;

public class ChainFactory {

    private static Chain getChain() {
        Chain chain = new Chain("Gold", "red stone",
                new BigDecimal(100));

        IntStream.range(0, 4).forEach(i ->
                chain.addStone(StoneFactory.getRandomStone()));

        return chain;
    }

    public static Chain getRandomChain() {

        return getChain();
    }
}
