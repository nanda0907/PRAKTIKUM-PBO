package Jobsheet08;

public class Ular extends Hewan {
    public boolean isberbisa;

    public Ular(boolean isberbisa, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.isberbisa = isberbisa;
    }

    @Override 
    public void bergerak() {
        System.out.println("Mengerutkan otot dari segala sisi hingga membentuk lengkungan");
        System.out.println("Memasukkan titik penahan seperti batu atau pohon");
        System.out.println("Menggunakan sisik untuk mendorong tubuh ke depan");
    }

    @Override
    public void bernapas() {
        System.out.println("Otot tulang rusuk kontraksi, udara masuk melalui lubang hidung");
        System.out.println("Trakea mengirimkan udara ke paru-paru");
        System.out.println("Otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung");
    }

    @Override 
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Apakah Ular Berbisa? : " + (this.isberbisa ? "Ya" : "Tidak"));
    }
}
