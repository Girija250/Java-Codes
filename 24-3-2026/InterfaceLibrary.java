interface library{
    void issuebook();
    void returnbook();
}

class student implements library{
    public void issuebook(){
        System.out.println("students can issue 2 books");
    }
    public void returnbook(){
        System.out.println("Students should return the book within 15days");
    }
}

class faculty implements library{
    public void issuebook(){
        System.out.println("Faculty can issue 5 books");
    }
    public void returnbook(){
        System.out.println("Faculty should return the book within 24days");
    }
}


public class InterfaceLibrary {
    public static void main(String[] args) {
        
        library l;
        l=new student();
        l.issuebook();
        l.returnbook();

        l=new faculty();
        l.issuebook();
        l.returnbook();
    }
}