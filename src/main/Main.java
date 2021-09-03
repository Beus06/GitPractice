package main;

import main.model.animals.Animal;
import main.model.animals.Cat;
import main.model.animals.Dog;
import main.model.animals.SeaCucumber;
import main.model.humanoids.Humanoid;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Humanoid FikuszKukisz = new Humanoid();
        FikuszKukisz.getNewPet(new Dog());
        FikuszKukisz.getNewPet(new Dog());
        FikuszKukisz.getNewPet(new Cat());
        Random randomNum = new Random();
        for (int i = 0; i < randomNum.nextInt(100); i++) {
            FikuszKukisz.getNewPet(new SeaCucumber());
        }
    }
}
