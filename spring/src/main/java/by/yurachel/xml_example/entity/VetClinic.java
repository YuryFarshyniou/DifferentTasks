package by.yurachel.xml_example.entity;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private Animal animal;
    private List<Animal> animals = new ArrayList<>();
    private String name;
    private int year;

    public void feedingPet() {
        System.out.println("Feeding : " + animal.eat());
    }

    public void introduce() {
        System.out.println("clinic: " + this.name + ", year: " + year);
    }


    /*Inversion of Control*/
    public VetClinic(Animal animal) {
        this.animal = animal;
    }

    public VetClinic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "VetClinic{" +
                "animal=" + animal +
                ", animals=" + animals +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
