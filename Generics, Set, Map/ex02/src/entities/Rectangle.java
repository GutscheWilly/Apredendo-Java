package entities;

import interfaces.Shape;

public class Rectangle implements Shape {
    
    private Double width;
    private Double height;
    
    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getwidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
