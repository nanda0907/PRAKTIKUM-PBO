package Jobsheet07.Tugas;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", "Hitam", 10000000, 15);
        Kulkas kulkas1 = new Kulkas("Polytron", "Putih", 5000000, "Dingin");
       
        System.out.println("Informasi Laptop:");
        System.out.println(laptop1.getInfo());

        System.out.println("Informasi Kulkas:");
        System.out.println(kulkas1.getInfo());
    }
}
