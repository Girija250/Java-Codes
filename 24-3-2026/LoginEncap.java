class user {
     private String username;
     private String password;
    
     public void setUsername(String username){
        this.username = username;
     }
     public void setPassword(String password){
        if(password.length() >= 6){
        this.password = password;
        } else {
            System.out.println("Password must be atleast 6 characters");
        }
     }
     public String getUsername(){
        return username;
     }
     public String getPassword(){
        return password;
     }
}

public class LoginEncap {
    public static void main(String[] args) {
        user u = new user();

        u.setUsername("Girija");
        u.setPassword("123abcde");

        System.out.println("Username : " + u.getUsername());
        System.out.println("Username : " + u.getPassword());

    }
    
}
