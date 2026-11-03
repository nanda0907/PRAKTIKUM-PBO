package Jobsheet09.Tugas;

public class Kulkas implements Elektronik {
    public String merk;
    public String harga;
    public int suhu;

    @Override 
    public void nyalakan() {
        System.out.println("Kulkas menyala");
    }
    
    @Override public void matikan() {
        System.out.println("Kulkas mati");
    }

    public void aturSuhu(int suhu) {
        System.out.println("Suhu kulkas diatur menjadi " + suhu);
    }
}
