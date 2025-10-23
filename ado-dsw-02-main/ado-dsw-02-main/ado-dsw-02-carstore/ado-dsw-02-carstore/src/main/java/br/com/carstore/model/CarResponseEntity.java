package br.com.carstore.model;

import br.com.carstore.dto.CarDTO;

import java.util.List;

public class CarResponseEntity {

    public CarResponseEntity() {
    }

    public CarResponseEntity(List<CarDTO> cars) {
        this.cars = cars;
    }

    private List<CarDTO> cars;



}
