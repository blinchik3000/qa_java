package com.example;

import java.util.List;

public class Feline extends Animal implements Felines, Predator {

    private Animal animal;
    public Feline(){}
    public Feline(Animal animal){
        this.animal=animal;
    }




    @Override
    public List<String> eatMeat() throws Exception {
        return animal.getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }
    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
