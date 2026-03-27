import java.util.*;
public class StudentRegistration {
    public static void main(String[] args) {

        HashSet<String> Set1 = new HashSet<>();
        LinkedHashSet<String> Set2 = new LinkedHashSet<>();
        TreeSet<String> Set3 = new TreeSet<>();

        String courses[] = {"Java", "Python", "SQL", "Java", "C++", "Python"};

        for (String course : courses) {
            if (Set1.add(course)) {
                Set2.add(course);
                Set3.add(course);
            }
        }
        System.out.println("Registered Courses: " + Set1);
        System.out.println("Sorted Courses (Insertion Order): " + Set2);
        System.out.println("Total Registered Courses: " + Set3.size());
    }
}