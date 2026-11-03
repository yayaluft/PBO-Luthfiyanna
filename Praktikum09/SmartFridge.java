package Praktikum09;

public class SmartFridge extends Kulkas implements Audible{
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
       volume -= 1;
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "Ukuran Layar: "+ ukuranLayar+"\n";
        info += "Volume: "+ volume+"\n";
        return info;
    }
}
