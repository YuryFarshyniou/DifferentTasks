package by.yurachel.annotation_example;

import by.yurachel.annotation_example.entity.Animal;
import by.yurachel.annotation_example.entity.VetClinic;
import by.yurachel.annotation_example.entity.impl.Cat;
import by.yurachel.annotation_example.entity.impl.Dog;
import by.yurachel.annotation_example.entity.impl.Hamster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("by.yurachel.annotation_example")
@PropertySource("classpath:vetClinic.properties")
public class SpringConfig {
    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Hamster hamster() {
        return new Hamster();
    }

    @Bean
    public List<Animal> list() {
        return new ArrayList<>(Arrays.asList(cat(),dog(),hamster()));
    }

    @Bean
    public VetClinic vetClinic() {
        return new VetClinic(list());
    }

}
