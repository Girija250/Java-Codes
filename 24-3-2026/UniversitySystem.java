import java.util.ArrayList;

interface UniversityMember {
    void getMemberType();
}
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}
class Student extends Person implements UniversityMember {
    int rollNumber;
    String course;

    Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }

    public void getMemberType() {
        System.out.println("Member Type: Student");
    }
}
class Faculty extends Person implements UniversityMember {
    int facultyId;
    String department; 
    Faculty(String name, int age, int facultyId, String department) {
        super(name, age);
        this.facultyId = facultyId;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
    }

    public void getMemberType() {
        System.out.println("Member Type: Faculty");
    }
}

class University {
    ArrayList<Person> members = new ArrayList<>();

    void addMember(Person p) {
        members.add(p);
        System.out.println("Member added successfully.");
    }

    void removeMember(Person p) {
        members.remove(p);
        System.out.println("Member removed successfully.");
    }

    void displayMembers() {
        for (Person p : members) {
            p.displayDetails();   
            if (p instanceof UniversityMember) {
                ((UniversityMember) p).getMemberType();
            }
            System.out.println("-------------------");
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University u = new University();

        Student s1 = new Student("Girija", 20, 101, "CSE");
        Faculty f1 = new Faculty("Arun", 40, 5001, "Computer Science");

        u.addMember(s1);
        u.addMember(f1);

        System.out.println("\nUniversity Members Details:");
        u.displayMembers();

        u.removeMember(s1);

        System.out.println("\nAfter Removing One Member:");
        u.displayMembers();
    }
}