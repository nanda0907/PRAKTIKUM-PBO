package Jobsheet09;

public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1; // Increase volume by 1        
    }

    @Override
    public void turunkanVolume() {
        volume -= 1; // Decrease volume by 1
    }

    public String getInfo() {
        return super.getInfo() + "\nUkuran Layar: " + ukuranLayar + "\nVolume: " + volume;
    }
}
