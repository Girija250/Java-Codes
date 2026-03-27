class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Lion is roaring");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Lion l = new Lion();
        l.eat();
        l.roar();
    }   
}
