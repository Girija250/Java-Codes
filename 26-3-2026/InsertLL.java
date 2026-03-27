import java.util.*;
public class InsertLL{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Elements = " + list);

        list.addFirst(0);
        list.addLast(40);

        System.out.println("Elements after adding in first and last : " + list);
    }
}
