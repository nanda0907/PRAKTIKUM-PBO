package Jobsheet10;
// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

        train(dosen1);
        train(tendik1);
    }

    public static void train(Pegawai pegawai){
        pegawai.displayInfo();
        System.out.println("Memberikan pelatihan kepada pegawai: ");
        System.out.println("Menginfokan SOP/Juknis: ");


        if (pegawai instanceof Dosen){
            System.out.println("Memberikan pelatihan pedagogik");
        }

        // //hanya test
        // System.out.println(pegawai.nidn);
        // System.out.println(pegawai.kategori);
        // pegawai.mengajar();
    }
}

