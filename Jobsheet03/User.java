package Jobsheet03;

public class User {
    public String username;
    public String email;
    public String password;
    public String name;

    public User(String username, String email, String password, String name) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
    }


    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);
        System.out.println("---------------------------");
    }
}
