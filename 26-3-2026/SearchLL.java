import java.util.LinkedList;

public class SearchLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int check = 0;

        if(list.contains(check)){
            System.out.println("Element " + check + " is present in list ");
        } else {
            System.out.println("Element " + check + " is not present in list ");
        }
    }
}
