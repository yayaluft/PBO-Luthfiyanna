package Praktikum09;

public class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public String getInfo() {
        String info = "";
        info += "Merk: "+ merk+"\n";
        info += "Warna: "+ warna+"\n";
        info += "Harga: "+ harga+"\n";
        return info;
    }
}
