package Jobsheet07.Tugas;

public class Kulkas extends Elektronik {
    public String suhu;

    // constructor tanpa parameter
    public Kulkas() {
        
    }

    // constructor dengan parameter
    public Kulkas(String merk, String warna, int harga, String suhu) {
        super(merk, warna, harga);
        this.suhu = suhu;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Suhu : " + suhu + "\n";
    }
}
