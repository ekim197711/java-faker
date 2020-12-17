package com.example.demo.space;

import com.github.javafaker.Faker;

import java.util.Locale;

public class SpaceShipFakerFactory {

    public SpaceShip createOne(){
        Faker faker = new Faker(Locale.getDefault());
        return SpaceShip.builder().
                fuel(faker.number().numberBetween(1, 100))
                .captain(faker.name().firstName())
                .model(faker.cat().breed())
                .build();

    }
}
