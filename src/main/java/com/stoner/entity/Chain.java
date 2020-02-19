package com.stoner.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Chain extends Material implements Serializable {

    private BigDecimal weight;
    private Stone[] stones;

    public Chain(String name, String type, BigDecimal weight) {
        super(name);
        this.weight = weight;
        stones = new Stone[10];
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Stone[] getStones() {
        return stones;
    }


    public void addStone(Stone stone) {

        resize();

        for (int i = 0; i < stones.length; i++) {
            if (stones[i] == null) {
                stones[i] = stone;
                break;
            }
        }
    }

    private void resize() {
        if (stones[stones.length - 1] != null) {
            Stone[] temp = new Stone[stones.length * 2];

            for (int i = 0; i < stones.length; i++) {
                temp[i] = stones[i];
            }

            stones = temp;
        }
    }

}

