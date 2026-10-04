package Quiz01;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pelanggan pelanggan = new Pelanggan("P001", "Friska");

        Produk produk1 = new Produk("PR001", "Indomie", 3500, 10);
        Produk produk2 = new Produk("PR002", "Teh Botol", 5000, 10);
        // produk1.setHarga(5000); //contoh penggunaan setter untuk mengubah harga produk1

        Transaksi transaksi = new Transaksi(
                "T001",
                LocalDate.of(2026, 9, 29),pelanggan);

        transaksi.tambahProduk(produk1);
        transaksi.tambahProduk(produk2);

        System.out.println("=== DATA TRANSAKSI ===");
        System.out.println("ID Transaksi : " + transaksi.getIdTransaksi());
        System.out.println("Tanggal      : " + transaksi.getTanggal());
        System.out.println("Pelanggan    : " + transaksi.getPelanggan().getNama());

        System.out.println();
        
        System.out.println("Produk yang dibeli:");
        System.out.println("- " + produk1.getNamaProduk() + " : Rp" + produk1.getHarga());
        System.out.println("- " + produk2.getNamaProduk() + " : Rp" + produk2.getHarga());

        System.out.println();
        System.out.println("Total Pembelian : Rp" + transaksi.hitungTotal());
    }
}