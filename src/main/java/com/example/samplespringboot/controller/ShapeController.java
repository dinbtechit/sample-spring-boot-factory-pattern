package com.example.samplespringboot.controller;

import com.example.samplespringboot.services.ShapeAdaptor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ShapeController {

    private final ShapeAdaptor shapeAdaptor;

    public ShapeController(ShapeAdaptor shapeAdaptor) {
        this.shapeAdaptor = shapeAdaptor;
    }

    @GetMapping(value = {"/draw/{penType}", "/draw"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> draw(@PathVariable("penType") Optional<String> penType) {
        return ResponseEntity.ok(shapeAdaptor.draw(penType));
    }

}
