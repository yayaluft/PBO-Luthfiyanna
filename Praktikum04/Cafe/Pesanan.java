package Praktikum04.Cafe;

public class Pesanan {
    private String noPesanan;
    private Kasir kasir;
    private String namaMenu;

    public String getNoPesanan() {
        return noPesanan;
    }

    public void setNoPesanan(String noPesanan) {
        this.noPesanan = noPesanan;
    }

    public Kasir getKasir() {
        return kasir;
    }

    public void setKasir(Kasir kasir) {
        this.kasir = kasir;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getInfo() {
        String info = "";
        info += "\tNo Pesanan: " + noPesanan;
        info += ", Menu: " + namaMenu;
        info += ", Kasir: " + kasir.getInfo();
        info += "\n";

        return info;
    }
}