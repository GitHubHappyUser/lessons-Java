package ru.geekbrains.lesson11;

public class Apple extends Fruit{
    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}