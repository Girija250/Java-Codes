public class compoundint {
    public static void main(String[] args) {
        double p = 1000;
        double r = 5;
        double t = 2;

        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
    }
}