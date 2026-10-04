package Quiz01;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private int harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, int harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
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
        return kodeProduk + " - " + namaProduk + " - Rp" + harga + " - Stok: " + stok;
    }
}
