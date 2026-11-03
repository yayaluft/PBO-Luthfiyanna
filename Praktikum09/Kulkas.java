package Praktikum09;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    public String getInfo() {
        String info = super.getInfo();
        info += "Jumlah Pintu: "+ jumlahPintu+"\n";
        return info;
    }
}
