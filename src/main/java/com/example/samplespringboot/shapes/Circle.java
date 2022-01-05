package com.example.samplespringboot.shapes;

public class Circle implements ShapeInterface {
    @Override
    public String draw() {
        return "This is a circle";
    }
}
