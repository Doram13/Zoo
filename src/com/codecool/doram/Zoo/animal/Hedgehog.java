package com.codecool.doram.Zoo.animal;

import com.codecool.doram.Zoo.Food;

public class Hedgehog extends Animal {
    private int nutrition;
    protected int max = 5;

    public Hedgehog(int fullness, String name) {
        super(fullness, name);
    }

    public void setNutrition(Food food) {
        switch (food) {
            case Meat:
                nutrition = -1;
                break;
            case Fruit:
                nutrition = 2;
                break;
            case Vegetable:
                nutrition = 0;
                break;
        }
    }

    @Override
    public void passADay(Food food) {
        setNutrition(food);
        this.fullness +=  nutrition;
        System.out.println(this.name + "'s fullness is: " + fullness);
        if (fullness >= max || fullness <= min) {
            System.out.println(this.name + " is DEAD!!! It's fullness is: " + fullness);
        }
    }

}
