package com.stoner.service;

import com.stoner.entity.Chain;
import com.stoner.util.ChainFactory;

import java.util.Locale;
import java.util.ResourceBundle;

public class ChainService {

    public Chain getChain() {
        return ChainFactory.getRandomChain();
    }

}

