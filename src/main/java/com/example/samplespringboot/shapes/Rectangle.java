package com.example.samplespringboot.shapes;

public class Rectangle implements ShapeInterface {
    @Override
    public String draw() {
        return "This is a Rectangle";
    }
}
