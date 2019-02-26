package com.codecool.doram.Zoo.animal;

import com.codecool.doram.Zoo.Food;

public class Rabbit extends Animal {
    private int nutrition;
    protected int max = 4;

    public Rabbit(int fullness, String name) {
        super(fullness, name);
    }

    public void setNutrition(Food food) {
        switch (food) {
            case Meat:
                nutrition = -1;
                break;
            case Fruit:
                nutrition = 1;
                break;
            case Vegetable:
                nutrition = 2;
                break;
        }
    }

    @Override
    public void passADay(Food food) {
        setNutrition(food);
        this.fullness +=  nutrition;
        System.out.println(this.name + "'s fullness is: " + fullness);
        if (fullness >= max || fullness <= min) {
            System.out.println(this.name + " is DEAD!!!");}
}

}
