package com.example.samplespringboot.shapes;

import com.example.samplespringboot.shapes.Circle;
import com.example.samplespringboot.shapes.Pencil;
import com.example.samplespringboot.shapes.Rectangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
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
