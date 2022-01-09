package com.example.samplespringboot.shapes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ShapeFactory {

    @Bean("default")
    @Primary
    public Pencil getDefault() {
        return new Pencil();
    }

    @Bean("circle")
    public Circle getCircle() {
        return new Circle();
    }

    @Bean("rectangle")
    public Rectangle getRectangle() {
        return new Rectangle();
    }

    @Bean("diamond")
    public Diamond getDiamond() {
        return new Diamond();
    }

}
