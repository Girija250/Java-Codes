public class armstrongnum {
    public static void main(String[] args){
        int num = 154;
        int original =  num;
        int sum = 0;

        while(num!=0){
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        if(sum == original){
            System.err.println(original + " is an armstrong number");
        }
        else{
            System.out.println(original +" is not an armstrong number");
        }
    }
    
}
