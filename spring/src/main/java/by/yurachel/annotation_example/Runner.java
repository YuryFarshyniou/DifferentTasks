package by.yurachel.annotation_example;

import by.yurachel.annotation_example.entity.Animal;
import by.yurachel.annotation_example.entity.CentralOffice;
import by.yurachel.annotation_example.entity.VetClinic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        listTest();
    }

    private static void listTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        VetClinic clinic = context.getBean("vetClinic", VetClinic.class);
        clinic.allPets();
        context.close();
    }

    private static void valueTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        VetClinic clinic = context.getBean("vetClinic", VetClinic.class);
        System.out.println(clinic.getName() + " " + clinic.getYear());
        context.close();
    }


    private static void qualifierTest() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");) {
            VetClinic clinic = context.getBean("vetClinic", VetClinic.class);
            clinic.feedingPet();
        }
    }

    private static void centralOfficeDependency() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");) {
            CentralOffice office = context.getBean("centralOffice", CentralOffice.class);
            System.out.println(office);
        }
    }

    private static void simpleAnnotation() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");) {
            Animal animal = context.getBean("cat", Animal.class);
            VetClinic clinic = new VetClinic(animal);
            clinic.feedingPet();

            Animal dog = context.getBean("dog", Animal.class);
            clinic.setAnimal(dog);
            clinic.feedingPet();

        }
    }
}
