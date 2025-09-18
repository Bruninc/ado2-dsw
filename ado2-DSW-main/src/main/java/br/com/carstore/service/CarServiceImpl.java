package br.com.carstore.service;

import br.com.carstore.dto.CarDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CarServiceImpl implements CarService{

    private final List<CarDTO> carList;

    public CarServiceImpl() {
        this.carList = new ArrayList<>();
    }

    @Override
    public List<CarDTO> findAll() {
        return this.carList;
    }

    @Override
    public void save(CarDTO carDTO) {
        if (carDTO.getId() == null) {
            carDTO.setId(UUID.randomUUID().toString());
        }
        this.carList.add(carDTO);
    }

    @Override
    public void deleteById(String id) {
        this.carList.removeIf(car -> car.getId().equals(id));
    }

    @Override
    public void update(String id, CarDTO carDTO) {
        this.carList.replaceAll(car -> car.getId().equals(id) ? carDTO : car);
    }

    public CarDTO findById(String id) {
        return this.carList.stream()
                .filter(car -> car.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
