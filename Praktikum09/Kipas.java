package Praktikum09;

public class Kipas extends AlatElektronik {
    public String jenis;

    public String getInfo() {
       String info =super.getInfo();
        info += "Jenis: "+ jenis+"\n";
        return info;
    }
}
