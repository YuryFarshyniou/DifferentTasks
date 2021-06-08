package by.yurachel.annotation_example.entity;

import by.yurachel.annotation_example.entity.impl.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;


public class VetClinic {
    private Animal animal;
    private Animal animal2;
    private List<Animal> list;
    @Value("${vetClinic.name}")
    private String name;
    @Value("${vetClinic.year}")
    private int year;


    public void feedingPet() {
        System.out.println("Feeding : " + animal.eat());
    }


    public VetClinic(List<Animal> list) {
        this.list = list;
    }

    public void allPets() {
        list.forEach(System.out::println);
    }

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

    public Animal getAnimal() {
        return animal;
    }


    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


    public Animal getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Animal animal2) {
        this.animal2 = animal2;
    }

    @Override
    public String toString() {
        return "VetClinic{" +
                "animal=" + animal +
                ", animal2=" + animal2 +
                '}';
    }
}
