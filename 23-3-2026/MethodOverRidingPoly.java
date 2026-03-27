//upcasting
//over riding runtime time not compiler time
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}

public class MethodOverRidingPoly {
    public static void main(String[] args) {
        //Reference    //Object type
        Animal a = new Cat();
        a.sound();
    }
    
}
