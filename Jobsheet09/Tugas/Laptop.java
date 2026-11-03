package Jobsheet09.Tugas;

public class Laptop implements Elektronik {
    public String merk;
    public String harga;

    @Override 
    public void nyalakan() {
        System.out.println("Tekan tombol power pada laptop");
        System.out.println("Tunggu hingga sistem operasi terbuka");
        System.out.println("Laptop menyala");
    }
    
    @Override public void matikan() {
        System.out.println("Tekan tombol power pada laptop");
        System.out.println("Tunggu hingga sistem operasi tertutup");
        System.out.println("Laptop mati");
    }

    public void bukaAplikasi() {
        System.out.println("Buka aplikasi yang dibutuhkan untuk mengerjakan tugas.");
    }
}
