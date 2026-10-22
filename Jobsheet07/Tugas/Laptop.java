package Jobsheet07.Tugas;

public class Laptop extends Elektronik {
    public int ukuranLayar;

    // constructor tanpa parameter
    public Laptop() {
        
    }

    // constructor dengan parameter
    public Laptop(String merk, String warna, int harga, int ukuranLayar) {
        super(merk, warna, harga);
        this.ukuranLayar = ukuranLayar;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Ukuran Layar : " + ukuranLayar + "\n";
    }
}
