package Jobsheet03;

public class TugasSetKoperasi {
    public static void main(String[] args) {
        TugasAnggota anggota1 = new TugasAnggota("11123456", "Donny", 5000000);
        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

        System.out.println("Meminjam uang 10.000.000...");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah Pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("Meminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah Pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("Membayar angsuran 1.000.000...");
        anggota1.bayarAngsuran(1000000);
        System.out.println("Jumlah Pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("Membayar angsuran 100.000...");
        anggota1.bayarAngsuran(100000);
        System.out.println("Jumlah Pinjaman saat ini: " + anggota1.getJumlahPinjaman());
        
    }
}
