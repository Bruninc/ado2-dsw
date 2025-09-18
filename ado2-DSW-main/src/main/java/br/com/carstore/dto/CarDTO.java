package br.com.carstore.dto;

import jakarta.validation.constraints.Size;

public class CarDTO {

    @Size(min = 1, max = 5, message = "erro de dados")
    private String name;
    private String color;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
