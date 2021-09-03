package main.model.humanoids;

import main.model.Gender;
import main.model.animals.Animal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Humanoid implements HumanoidInterface {

    protected String lastName;
    protected String firstName;
    protected LocalDate birth;
    protected boolean isSad;

    protected List<Animal> petsOwned;

    public Humanoid() {}

    public Humanoid(String lastName, String firstName, LocalDate birth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birth = birth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public boolean isSad() {
        return isSad;
    }

    public void setSad(boolean sad) {
        isSad = sad;
    }

    public List<Animal> getPetsOwned() {
        return petsOwned;
    }

    public void setPetsOwned(List<Animal> petsOwned) {
        this.petsOwned = petsOwned;
    }

    @Override
    public void getNewPet(Animal animal) {

       this.petsOwned.add(animal);

    }

    @Override
    public void feedPets() {
        for ( int i =0; i < this.petsOwned.size(); i++)
       this.petsOwned.get(i).eat();
    }

    @Override
    public void renamePet(Animal animal, String newName) {
        animal.setName(newName);
    }

}
