package Jobsheet02;

public class DragonMain {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon(2, 2, 1);
        Dragon dragon2 = new Dragon(4, 4, 2);

        System.out.println("=== DRAGON 1 ===");
        dragon1.printStatus();

        System.out.println("\n=== DRAGON 2 ===");
        dragon2.printStatus();

        System.out.println("\nDragon 1 bergerak:");
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println("\nDragon 1 mengubah arah menjadi kanan:");
        dragon1.changeDirection(1);
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println("\nDragon 2 bergerak:");
        dragon2.move(2);
        dragon2.printStatus();

        System.out.println("\nDragon 2 mengubah arah menjadi bawah:");
        dragon2.changeDirection(2);
        dragon2.move(2);
        dragon2.printStatus();
    }
}