package Jobsheet09;

public class Main {
    public static void main(String[] args) {
        Kulkas kulkas1 = new Kulkas();
        kulkas1.harga = 5000000;
        kulkas1.merk = "Samsung";
        kulkas1.warna = "Silver";
        kulkas1.jumlahPintu = "2 Pintu";

        System.out.println("Informasi Kulkas:");
        System.out.println(kulkas1.getInfo());

        Kipas kipas1 = new Kipas();
        kipas1.harga = 300000;
        kipas1.merk = "Miyako";
        kipas1.warna = "Putih";
        kipas1.jenis = "Kipas Angin Berdiri";

        System.out.println("\nInformasi Kipas:");
        System.out.println(kipas1.getInfo());
    }
}
