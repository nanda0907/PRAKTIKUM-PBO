package Jobsheet09.Tugas;

public class Kulkas implements Elektronik {
    public String merk;
    public String harga;
    public int suhu;

    @Override 
    public void nyalakan() {
        System.out.println("Hubungkan kabel kulkas ke stopkontak");
        System.out.println("Kulkas mulai mendinginkan");
    }
    
    @Override public void matikan() {
        System.out.println("Putuskan kabel kulkas dari stopkontak");
        System.out.println("Kulkas mati");
    }

    public void aturSuhu(int suhu) {
        System.out.println("Suhu kulkas diatur menjadi " + suhu);
    }
}
