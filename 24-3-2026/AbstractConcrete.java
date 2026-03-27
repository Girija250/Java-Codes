abstract class Animal{
    //Abstract Method
    abstract void sound();
    //Concrete Method
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat Meows");
    }
}

public class AbstractConcrete{
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();
        a.eat();

        a=new Cat();
        a.sound();
    }
}