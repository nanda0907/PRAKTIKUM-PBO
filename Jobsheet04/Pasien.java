package Jobsheet04;
import java.util.ArrayList;
import java.time.LocalDate;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi; //ArrayList untuk menyimpan banyak objek Konsultasi

    // constructor untuk menginisialisasi objek Pasien dengan noRekamMedis dan nama, serta membuat ArrayList kosong untuk riwayatKonsultasi
    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<>();
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo(){
        String info = ""; // Variabel lokal untuk menampung informasi
        info += "No Rekam Medis: " + this.noRekamMedis + "\n";
        info += "Nama: " + this.nama + "\n"; 
        
        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi:\n";

            // Mengambil setiap objek Konsultasi dari ArrayList
            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi.";
        }
        info += "\n"; //menambahkna baris baru di akhir informasi
        return info;
    }

    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi(); //membuat objek Konsultasi baru
        konsultasi.setTanggal(tanggal); //mengisi tanggal konsultasi
        konsultasi.setDokter(dokter); //mengisi dokter yang menangani konsultasi
        konsultasi.setPerawat(perawat); //mengisi perawat yang menangani konsultasi
        riwayatKonsultasi.add(konsultasi); //menyimpan objek Konsultasi ke dalam ArrayList riwayatKonsultasi
    }
}
