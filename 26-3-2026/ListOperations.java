import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<String>items = new ArrayList<>();

        items.add("apple");
        items.add("Orange");
        items.add("banana");
        items.add(2,"kiwi");

        String arr[] = items.toArray(new String[0]);
        for(int i = 0; i<items.size();i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        System.out.println(items);
        System.out.println(items.get(3));
        System.out.println(items.size());
        System.out.println(items.indexOf("banana"));
        System.out.println(items.lastIndexOf("banana"));
        System.out.println(items.isEmpty());
        items.set(3,"lemon");
        System.out.println(items);
        items.remove(2);
        System.out.println(items);
        items.remove("lemon");
        System.out.println(items);
        items.clear();
        System.out.println(items);
        boolean checkk = items.contains("banana");
        System.out.println(checkk);
    }
    
}
