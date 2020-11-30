package com.example.demo.space;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SpaceShip {
    private String model;
    private String captain;
    private Integer fuel;
}
