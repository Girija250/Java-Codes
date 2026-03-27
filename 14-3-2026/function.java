public class function {
    void greet()//function definition - without return type and without args 
    {
        System.out.println("Hello, World!");
    }
    void welcome(String name) //function definition - without return type and with args
    {
        System.out.println("Welcome, " + name + "!");
    }
    int add(int a, int b) //function definition - with return type and with args
    {
        System.out.println("The sum of " + a + " and " + b + " is: "+(a+b));
        return a + b;
    }
    float area()
    {
        float radius = 5.0f;
        float area = (float) (Math.PI * radius * radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        return area;
    }
    public static void main(String[] args) {
    function person = new function();
    for (int i = 0; i < 5; i++) 
        person.greet();   //Function call
    person.welcome("Manoj"); //Function call with argument
    person.welcome("Suman"); //Function call with argument
    person.add(10, 20); //Function call with arguments
    person.area(); //Function call without arguments
    }


}