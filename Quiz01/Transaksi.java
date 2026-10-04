package Quiz01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Transaksi {
    private String idTransaksi;
    private LocalDate tanggal;
    private Pelanggan pelanggan;
    private ArrayList<Produk> daftarProduk;

    public Transaksi(String idTransaksi, LocalDate tanggal, Pelanggan pelanggan) {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.pelanggan = pelanggan;
        this.daftarProduk = new ArrayList<>();
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi){
        this.idTransaksi = idTransaksi; //this ini tuh current object, object yg sedang dijalankan
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotal() {
        double total = 0;

        for (Produk produk : daftarProduk) {
            total = total + produk.getHarga();
        }
        return total;
    }

    public String getInfo() {
        return idTransaksi + " - " + tanggal + " - " + pelanggan.getNama();
    }
}
