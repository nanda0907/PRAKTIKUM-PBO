package Jobsheet10;

public class Dosen extends Pegawai implements Comparable<Dosen> {
    public String nidn;

    public Dosen() {

    }

    public Dosen(String nidn) {
        this.nidn = nidn;
    }

    public Dosen(String nama, String nip, String nidn) {
        super(nama, nip);
        this.nidn = nidn;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN Dosen: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }

    @Override
    public int compareTo(Dosen otherDosen) {
        return this.nip.compareTo(otherDosen.nip);
    }
}
