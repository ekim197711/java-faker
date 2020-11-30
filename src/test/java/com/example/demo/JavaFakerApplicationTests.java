package com.example.demo;

import com.example.demo.space.SpaceShip;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

@SpringBootTest
class JavaFakerApplicationTests {

    @Test
    void contextLoads() {
        Faker faker = new Faker(Locale.US);
        System.out.println("streetname: " + faker.address().streetName());
        System.out.println("city: " + faker.address().city());
        System.out.println("app name: " + faker.app().name());
        System.out.println("yeast: " + faker.beer().yeast());
        System.out.println("beer name: " + faker.beer().name());

        SpaceShip spaceShip = SpaceShip.builder()
                .fuel(faker.number().numberBetween(50, 80))
                .captain(faker.name().fullName())
                .model(faker.chuckNorris().fact())
                .build();

        System.out.println("Spaceship: " + spaceShip);

    }

}
