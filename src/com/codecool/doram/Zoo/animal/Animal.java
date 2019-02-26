package com.codecool.doram.Zoo.animal;

import com.codecool.doram.Zoo.Food;

public abstract class Animal {
    protected int fullness;
    protected String name;
    protected int max;
    protected int min;

    public Animal(int fullness, String name) {
        this.fullness = fullness;
        this.name = name;
    }

    public abstract void passADay(Food food);
}
