package org.example.zoo;

/**
 * ООП - это подход к разработке программ, при котором программа строится как набор объектов, взаимодействующих друг с другом.
 *
 * Основные 4 принципа ООП:
 * 1) инкапсуляция - сокрытие внутренней структуры объекта от внешних взаимодействий путем обращения к этой структуре
 * только через методы самого объекта
 * 2) наследование - это принцип ООП, согласно которому класс-потомок наследует все свойства и методы класса-родителя
 * => мы можем не дублировать код
 * 3) полиморфизм - это способность метода работать с данными разных типов, полиморфизм невозможен без наследования
 * выделяют истинный (то, что я показал) и ложный (перегрузка методов) полиморфизм
 * 4) абстракция
 */
public class Animal {
    private String name;
    private int age;
    private String animalPassport;

    public Animal(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("hello from animal");
    }

    public String getAnimalPassport() {
        if (name == "Kate"){
            return animalPassport;
        } else {
            return null;
        }
    }

    public void setAnimalPassport(String animalPassport) {
        if (name == "kate"){
            this.animalPassport = animalPassport;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
