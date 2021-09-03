package main.model.animals;

import main.model.Food;
import main.model.humanoids.Humanoid;

import java.time.LocalDate;

public class Animal implements AnimalInterface {

    protected String name;
    protected LocalDate birth;
    protected String favoriteToy;
    protected Food favoriteFood;
    protected boolean isHungry;

    protected Humanoid owner;

    public Animal() {}

    public Animal(String name, LocalDate birth, String favoriteToy, Food favoriteFood, Humanoid owner) {
        // TODO
    }

    @Override
    public void eat() {
        // TODO
    }

    @Override
    public void makeSound() {
        // TODO
    }

    @Override
    public void play() {
        // TODO
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Humanoid getOwner() {
        return owner;
    }

    public void setOwner(Humanoid owner) {
        this.owner = owner;
    }
}
