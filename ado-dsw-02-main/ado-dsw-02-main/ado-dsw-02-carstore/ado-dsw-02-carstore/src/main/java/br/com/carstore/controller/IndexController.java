package br.com.carstore.controller;

import br.com.carstore.dto.CarDTO;
import br.com.carstore.model.Car;
import br.com.carstore.model.CarResponseEntity;
import br.com.carstore.service.CarService;
import br.com.carstore.service.CarServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IndexController {

    CarService carService;

    @PostMapping("/api/cars")
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO car) {
        this.carService.save(car);
        return ResponseEntity.ok().build();
    }

}

