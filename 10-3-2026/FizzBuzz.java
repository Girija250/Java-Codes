public class FizzBuzz {
    public static void main(String[] args){
        int num =2;
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println(num + " is either Fizz or Buzz");
        } 
        else if ( num % 5 == 0){
            System.out.println(num + " is a Buzz");
        } 
        else if (num % 3 == 0 ){
            System.out.println(num + " is a Fizz");
        } 
        else {
            System.out.println(num + " is FizzBuzz");
        }
    }
    
}
