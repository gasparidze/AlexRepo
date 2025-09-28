package org.example.zoo;


public class Tiger extends Animal{
    private String uniqueParam;

    public Tiger(String name , int age , String uniqueParam) {
        super(name , age);
        this.uniqueParam = uniqueParam;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from tiger");
    }
}
