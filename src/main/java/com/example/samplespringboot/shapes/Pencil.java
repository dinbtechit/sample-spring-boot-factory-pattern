package com.example.samplespringboot.shapes;

public class Pencil implements ShapeInterface {
    @Override
    public String draw() {
        return "This is a Pencil";
    }
}
