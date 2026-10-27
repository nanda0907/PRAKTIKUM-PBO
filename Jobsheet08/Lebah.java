package Jobsheet08;

public class Lebah extends Hewan {
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bernapas(){
        System.out.println("Otot perut mengednur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirimkan oksigen");
        System.out.println("Otot perut berikontraksi, udara keluar melalui lubang di segmen tubuh");
    }

    @Override
    public void bergerak(){
        System.out.println("Mengepakkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derajat");
        System.out.println("Mengepakkan sayap ke belakang");
    }

    @Override 
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Kasta Lebah : " + this.kasta);
    }
    
}
