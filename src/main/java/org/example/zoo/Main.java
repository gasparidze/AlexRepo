package org.example.zoo;

public class Main {
    public static void main(String[] args) {
        Lion boris = new Lion("Boris", 4, "orange");
        Monkey bananasik = new Monkey("bananasik", 3, 10);
        Tiger tigrulya = new Tiger("tigrulya", 5, "uniqueParam");

        /**
         * при вызове sayHello() у нас применяется конкретная реализация класса-наследника
         */
//        boris.sayHello();
//        bananasik.sayHello();
//        tigrulya.sayHello();

        /**
         * Мы можем слева указать класс родитель, а справа указать класс потомок из-за наследования
         * слева мы указываем тип данных, т.к. у нас тип данных Animal, то мы и ограничены всеми полями и методы класса Animal,
         * а справа берем реализацию этих методов у класса-наследника
         */
        Animal boris1 = new Lion("Boris1", 5, "orange");
        boris1.sayHello();

        Animal[] animals = new Animal[3];
        animals[0] = boris;
        animals[1] = bananasik;
        animals[2] = tigrulya;

        for (Animal animal : animals){
            animal.sayHello(); // полиморфный вызов метода
        }

        say(tigrulya);
        say(boris);
        say(bananasik);
    }

    public static void say(Animal animal){
        animal.sayHello();
    }

//    public static void say(Lion tiger){
//        tiger.sayHello();
//    }
//
//    public static void say(Monkey tiger){
//        tiger.sayHello();
//    }
//
//    public static void say(Tiger tiger){
//        tiger.sayHello();
//    }
}
