import java.util.ArrayList;
public class MarkManagement {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(100);
        marks.add(95);
        marks.add(87);
        marks.add(90);
        marks.add(89);

        int sum = 0; 
         for(int i = 0; i < marks.size(); i++){
            sum += marks.get(i);
         }
         double average = (double) sum / marks.size();
         System.out.println("Average marks = " + average);
    }
    
}
