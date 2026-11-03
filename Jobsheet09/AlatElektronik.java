package Jobsheet09;

public class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;


    public String getInfo() {
        String info = "";
        info += "Harga  : " + harga + "\n";
        info += "Merk : " + merk + "\n";
        info += "Warna : " + warna + "\n";
        return info;
    }
}
