class Student{
    int marks(int sub1, int sub2){
        return sub1 + sub2;
    }
    int marks(int sub1, int sub2, int sub3){
        return sub1 + sub2 + sub3;
    }
}
public class StudentMarksTotal {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Total marks for 2 subjects = " + s.marks(80,95));
        System.out.println("Total marks for 3 subjects = " + s.marks(85,60,100));
    }
    
}
