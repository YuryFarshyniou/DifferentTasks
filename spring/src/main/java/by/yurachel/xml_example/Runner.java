package by.yurachel.xml_example;

import by.yurachel.xml_example.entity.Animal;
import by.yurachel.xml_example.entity.VetClinic;
import by.yurachel.xml_example.entity.impl.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        VetClinic clinic = xmlDependInjection();
//        clinic.feedingPet();
//        clinic.introduce();

        animalsAreEating();
    }

    private static VetClinic xmlDependInjection() {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            return context.getBean("vetClinic", VetClinic.class);
        }
    }

    private static void animalsAreEating() {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            VetClinic clinic = context.getBean("vetClinic", VetClinic.class);

            List<Animal> animals = clinic.getAnimals();
            animals.forEach(animal -> System.out.println(animal.eat()));

        }
    }


    private static Animal xmlContext() {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Animal animal = context.getBean("animalBean", Animal.class);
            animal.eat();
            return animal;
        }
    }


    private static void annotationContext() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("by.yurachel.ioc_example.entity");
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println("init beans: " + beanDefinitionCount);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
        Cat bean = context.getBean(Cat.class);
        bean.eat();

    }
}
