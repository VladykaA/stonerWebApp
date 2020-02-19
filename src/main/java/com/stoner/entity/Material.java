package com.stoner.entity;

public abstract class Material {
    private String name;
    private String type;

    public void doSomething(){
    }


    public Material(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
