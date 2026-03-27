import java.util.LinkedList;

public class Iterate {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }    
}