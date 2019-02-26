package com.codecool.doram.Zoo.animal;

import com.codecool.doram.Zoo.Food;

public class Wolf extends Animal {
    private int nutrition;
    protected int max = 6;
    private boolean dead = false;

    public Wolf(int fullness, String name) {
        super(fullness, name);
    }

    public void setNutrition(Food food) {
        switch (food) {
            case Meat:
                nutrition = 3;
                break;
            case Fruit:
                nutrition = -1;
                break;
            case Vegetable:
                nutrition = -1;
                break;
        }
    }

    @Override
    public void passADay(Food food) {
        if (!dead) {
            setNutrition(food);
            this.fullness += nutrition;
            System.out.println(this.name + "'s fullness is: " + fullness);
            if (fullness >= max || fullness <= min) {
                this.dead = true;
                System.out.println(this.name + " is DEAD!!! It's fullness is: " + fullness);
            }
        }
    }

}
