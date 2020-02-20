package com.stoner.util;

import com.stoner.entity.Chain;

import java.util.ArrayList;
import java.util.List;

public class ChainStorage {
    private static List<Chain> chains;

    static {
        chains = new ArrayList<>();
    }

    public static void addChain(Chain chain) {
        chains.clear();
        chains.add(chain);
    }

    public static List<Chain> getChains() {
        return chains;
    }
}
