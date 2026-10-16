package Jobsheet07;

public class Pegawai {
    public String nama;
    public String nip;
    public double gaji;

    public Pegawai() {
        System.out.println("Ini constructor class Pegawai");
    }

    public Pegawai(String nama, String nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }

    public String getInfo() {
        String info = "";
        info += "Nama  : " + nama + "\n";
        info += "NIP   : " + nip + "\n";
        info += "Gaji  : " + gaji + "\n";
        return info;
    }
}
