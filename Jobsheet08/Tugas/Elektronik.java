package Jobsheet08.Tugas;

public abstract class Elektronik {
    public String merk;
    public String warna;
    public int harga;

    // // constructor tanpa parameter
    // public Elektronik() {
        
    // } 

    // constructor dengan parameter
    public Elektronik(String merk, String warna, int harga) {
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
    }

    public abstract void gunakan();

    public String getInfo() {
        String info = "";
        info += "Merk  : " + merk + "\n";
        info += "Warna : " + warna + "\n";
        info += "Harga : " + harga + "\n";
        return info;
    }
}
