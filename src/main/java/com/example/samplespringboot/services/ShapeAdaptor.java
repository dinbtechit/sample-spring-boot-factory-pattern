package com.example.samplespringboot.services;

import com.example.samplespringboot.shapes.ShapeInterface;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShapeAdaptor implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private final ShapeInterface defaultShape;

    public ShapeAdaptor(
            ShapeInterface defaultShape) {
        this.defaultShape = defaultShape;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String draw(Optional<String> penType) {
        ShapeInterface shapeInterface;
        try {
            if (penType.isPresent()) {
                shapeInterface = (ShapeInterface) applicationContext.getBean(penType.get());
            } else {
                return defaultShape.draw();
            }
        } catch (NoSuchBeanDefinitionException e) {
            return defaultShape.draw();
        }
        return shapeInterface.draw();
    }
}
