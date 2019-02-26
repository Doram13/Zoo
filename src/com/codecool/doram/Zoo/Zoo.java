package com.codecool.doram.Zoo;

import com.codecool.doram.Zoo.animal.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animalList = new ArrayList<>();


    public void fillZoo() {
        Rabbit rabbit1 = new Rabbit(2,"Tapsi");
        animalList.add(rabbit1);
        Wolf wolf1 = new Wolf(3,"Akela");
        animalList.add(wolf1);
        Bear bear1 = new Bear(4,"Balu");
        animalList.add(bear1);
        Bear bear2 = new Bear(6,"Brumi");
        animalList.add(bear2);
        Hedgehog hedge1 = new Hedgehog(4,"Durum");
        animalList.add(hedge1);
    }

    public void simulateADay(Food food) {
        for (Animal animal: animalList) {
            animal.passADay(food);
        }
    }
}
