package Jobsheet08.Tugas;

public class Kulkas extends Elektronik {
    public String suhu;

    // // constructor tanpa parameter
    // public Kulkas() {
    
    // }

    // constructor dengan parameter
    public Kulkas(String merk, String warna, int harga, String suhu) {
        super(merk, warna, harga);
        this.suhu = suhu;
    }

    @Override 
    public void gunakan(){
        System.out.println("Menghubungkan kulkas ke listrik");
        System.out.println("Memastikan kulkas menyala dengan baik.");
        System.out.println("Kulkas siap digunakan");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Suhu : " + suhu + "\n";
    }
}
