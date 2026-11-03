package Jobsheet09;

public class Kulkas extends AlatElektronik {
    public String jumlahPintu;

    public String getInfo() {
        return super.getInfo() + "\nJumlah Pintu: " + jumlahPintu;
    }
}
