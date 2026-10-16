package Jobsheet07;

public class Dosen extends Pegawai {
    public String nidn;
    
    // @Override 
    // public String getInfo() {
    //     String info = super.getInfo();
    //     info += "NIDN  : " + nidn + "\n";
    //     return info;
    // }


    public Dosen() {
        System.out.println("Ini constructor class Dosen");
    }

    public Dosen(String nama, String nip, double gaji, String nidn) {
        this.nidn = nidn;
        super(nama, nip, gaji);
    }

    public String getInfo(){
        return "NIDN  : " + nidn + "\n";
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += getInfo();
        
        return info;
    }
}
