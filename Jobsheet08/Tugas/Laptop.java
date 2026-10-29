package Jobsheet08.Tugas;

public class Laptop extends Elektronik {
    public int ukuranLayar;

    // // constructor tanpa parameter
    // public Laptop() {
        
    // }

    // constructor dengan parameter
    public Laptop(String merk, String warna, int harga, int ukuranLayar) {
        super(merk, warna, harga);
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public void gunakan() {
        System.out.println("Menekan tombol power laptop...");
        System.out.println("Menunggu sistem operasi menyala...");
        System.out.println("Laptop siap digunakan.");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Ukuran Layar : " + ukuranLayar + "\n";
    }
}