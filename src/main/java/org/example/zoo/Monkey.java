package org.example.zoo;

public class Monkey extends Animal{
    private int quantityOfBananas;

    public Monkey(String name , int age , int quantityOfBananas) {
        super(name , age);
        this.quantityOfBananas = quantityOfBananas;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from monkey");
    }
}
