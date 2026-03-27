public class swap {
    public static void main(String[] args){
        int a=10;
        int b=20;
        
        System.out.println("Before swap: a="+a);
        System.out.println("Before swap: b="+b);

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swap: a="+a);
        System.out.println("After swap: b="+b);
    }
    
}
