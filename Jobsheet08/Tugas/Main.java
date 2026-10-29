package Jobsheet08.Tugas;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", "Hitam", 10000000, 15);
        System.out.println(laptop1.getInfo());
        laptop1.gunakan();
    }
}