package Praktikum09;

public class TV extends AlatElektronik implements Audible{
    public String jenisLayar;
    public int volume;
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
        info += "Jenis Layar: "+ jenisLayar+"\n";
        info += "Volume: "+ volume+"\n";
        return info;
    }
}
