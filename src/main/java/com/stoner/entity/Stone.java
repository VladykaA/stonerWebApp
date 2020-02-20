package com.stoner.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Stone extends Material implements Serializable {

    private BigDecimal price;
    private BigDecimal carat;
    private Transparency transparency;
    private Color color;

    public Stone(String name, BigDecimal price,
                 BigDecimal carat, Transparency transparency, Color color) {
        super(name);
        this.price = price;
        this.carat = carat;
        this.transparency = transparency;
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCarat() {
        return carat;
    }

    public void setCarat(BigDecimal carat) {
        this.carat = carat;
    }

    public Transparency getTransparency() {
        return transparency;
    }

    public void setTransparency(Transparency transparency) {
        this.transparency = transparency;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
