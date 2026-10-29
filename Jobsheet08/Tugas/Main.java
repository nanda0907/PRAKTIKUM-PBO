package Jobsheet08.Tugas;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", "Hitam", 10000000, 15);
        System.out.println(laptop1.getInfo());
        laptop1.gunakan();

        Kulkas kulkas1 = new Kulkas("Polytron", "Putih", 5000000, "Dingin");
        System.out.println(kulkas1.getInfo());
        kulkas1.gunakan();
    }
}