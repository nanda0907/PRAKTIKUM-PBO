package Jobsheet09.Tugas;

public class Laptop implements Elektronik {
    public String merk;
    public String harga;

    @Override 
    public void nyalakan() {
        System.out.println("Laptop menyala");
    }
    
    @Override public void matikan() {
        System.out.println("Laptop mati");
    }

    public void bukaAplikasi() {
        System.out.println("Laptop membuka aplikasi.");
    }
}
