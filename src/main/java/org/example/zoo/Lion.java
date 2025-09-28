package org.example.zoo;

/**
 * extends - ключевое слово, которое говорит, что класс Lion является наследником класса Animal
 * => жизненный цикл создания класса-потомка связан с жизненным циклом создания класса-родителя
 * => мы обязаны вызвать конструктор у класса родителя, осуществляется это с помощью ключевого слова
 * super - это ссылка на объект родителя
 * super(param1, .., paramN) - вызываем конструктор родителя
 * super.field - обращаемся к полю родителя
 * super.method() - обращаемся к методу родителя
 */
public class Lion extends Animal{
    private String grivaColor;

    public Lion(String name , int age, String grivaColor) {
        super(name , age);
        this.grivaColor = grivaColor;
    }

    /**
     * Мы можем переопределять методы класса родителя, т.е. мы задаем свою реалиацию, но при этом сигнатура метода
     * должны остаться прежней
     *
     * @Override - это аннотация, это некоторая метка в коде, которая добавляет некоторую дополнительную функциональность
     * @Override - проверяет сигнатуру метода
     */
    @Override
    public void sayHello() {
        System.out.println("hello from lion");
    }

    public String getGrivaColor() {
        return grivaColor;
    }

    public void setGrivaColor(String grivaColor) {
        this.grivaColor = grivaColor;
    }
}
