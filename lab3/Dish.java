package ru.mirea.komov.lab3;

public class Dish {
    protected String material;
    protected String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Посуда{" +
                "Материал " + material + '\'' +
                ", Цвет" + color + '\'' +
                '}';
    }
}
