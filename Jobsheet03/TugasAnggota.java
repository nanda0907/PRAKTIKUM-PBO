package Jobsheet03;

public class TugasAnggota {
    String noKTP;
    String nama;
    int limitPinjaman;
    int jumlahPinjaman;

    public TugasAnggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.jumlahPinjaman = 0;
        this.limitPinjaman = limitPinjaman;
    }

    public void displayInfo() {
        System.out.println("No KTP: " + this.noKTP);
        System.out.println("Nama: " + this.nama);
        System.out.println("Limit Pinjaman: " + this.limitPinjaman);
        System.out.println("Jumlah Pinjaman: " + this.jumlahPinjaman);
        System.out.println("---------------------------");
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPinjaman(int limitPinjaman) {
        if (limitPinjaman > 5000000) {
            System.out.println("Limit pinjaman maksimal adalah 5.000.000.");
            return;
        } else {
            this.limitPinjaman = limitPinjaman;
        }
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(int jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

     public void pinjam(int uang) {
        if (this.jumlahPinjaman + uang > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += uang;
        }
    }

    public void bayarAngsuran(int uang) {
        int minimalAngsuran = this.jumlahPinjaman * 10 / 100; // 10% dari jumlah pinjaman

        if (uang < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else
        if (uang > this.jumlahPinjaman) {
            this.jumlahPinjaman = 0;

        } else if (uang < 0) {
            System.out.println("Jumlah angsuran tidak boleh negatif.");
        } else {
            this.jumlahPinjaman -= uang;
        }
    }
    
}
