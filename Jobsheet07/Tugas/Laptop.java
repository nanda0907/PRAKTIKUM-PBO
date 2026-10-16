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

    // public String getInfo(){
    //     return "Ukuran Layar  : " + ukuranLayar + "\n";
    // }

    // public String getAllInfo(){
    //     String info = super.getInfo();
    //     info += getInfo();
        
    //     return info;
    // }

    @Override
    public String getInfo() {
        return super.getInfo() + "Ukuran Layar : " + ukuranLayar + "\n";
    }
}
