public class ConsOverload {

    ConsOverload(int height, int breadth) {
        System.out.println("The area of the rectangle is: " + (height * breadth));
    }

    ConsOverload(int side) {
        System.out.println("The area of the square is: " + (side * side));
    }

    public static void main(String[] args) {
        ConsOverload rectangle = new ConsOverload(6, 3);
        ConsOverload square = new ConsOverload(6);
    }
}