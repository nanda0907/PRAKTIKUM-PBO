package Jobsheet04;
import java.time.LocalDate;

public class RumahSakitDemo {
    public static void main(String[] args) {
        Pegawai ani = new Pegawai("1234", "Dr. Ani");
        Pegawai Bagus = new Pegawai("4567", "Dr. Bagus");

        Pegawai desi = new Pegawai("1234", "Ns. Desi");
        Pegawai eka = new Pegawai("4567", "Ns. Eka");

        Pasien pasien1 = new Pasien("343298", "Puspa"); //memanggil constructor Pasien untuk membuat objek pasien1
        pasien1.tambahKonsultasi(LocalDate.of(2021, 06, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2024, 06, 11), Bagus, eka);
        System.out.println(pasien1.getInfo());
        
        Pasien pasien2 = new Pasien("343299", "Budi");
        System.out.println(pasien2.getInfo());
    }
}
