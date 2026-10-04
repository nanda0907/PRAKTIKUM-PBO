package Quiz01;

public class Produk {
    private String kodeProduk;
    private String nama;
    private int harga;
    private int stok;

    public Produk(String kodeProduk, String nama, int harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getInfo() {
        return kodeProduk + " - " + nama + " - Rp" + harga + " - Stok: " + stok;
    }
}
