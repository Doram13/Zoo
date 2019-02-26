package com.codecool.doram.Zoo.main;

import com.codecool.doram.Zoo.Food;
import com.codecool.doram.Zoo.Zoo;

public class Main {

    public static void main(String[] args) {
        Zoo annaZoo = new Zoo();
        annaZoo.fillZoo();
        annaZoo.simulateADay(Food.Meat);
        annaZoo.simulateADay(Food.Vegetable);
        annaZoo.simulateADay(Food.Meat);
        annaZoo.simulateADay(Food.Fruit);
        annaZoo.simulateADay(Food.Meat);
    }
}
