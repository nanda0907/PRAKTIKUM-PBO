package Jobsheet04;

public class Pegawai {
    private String nip; //atribut private itu hanya bisa diakses di dalam kelas itu sendiri, tidak bisa diakses dari luar kelas
    private String nama;

    // ini method constructor, method ini akan dijalankan ketika objek dibuat, dipanggil ketika objek pegawai dibuat menggunakan new
    public Pegawai(String nip, String nama) {
        this.nama = nama;
        this.nip = nip;
    }

    // ini method getter, method ini digunakan untuk mengambil nilai dari atribut private
    // method getter ini bisa diakses dari luar kelas, sehingga bisa digunakan untuk mengambil nilai dari atribut private
    // method getter ini biasanya digunakan untuk menampilkan data dari objek (mengembalikan nilai dari atribut private)
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo(){
        return nama + " (" + nip + ")";
    }
}
