class area {
    area(int height, int breadth){
        System.out.println("The area of rectangle is : " + height*breadth);
    }
    void square(int side){
        System.out.println("The area of square is :" + side*side);
    }
}
public class AreaConstructor {
    public static void main(String[] args) {
        area shapes = new area(6,3);
        shapes.square(5);
    }
}
