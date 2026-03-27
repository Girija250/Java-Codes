public class NumberFormatExcExample {
    public static void main(String[] args) {
        try {
            String str = "12A3";   
            int num = Integer.parseInt(str);
            System.out.println("Converted number: " + num);
        } 
        catch (NumberFormatException e) {
            System.out.println("Exception caught: Invalid number format.");
        }
    }
}