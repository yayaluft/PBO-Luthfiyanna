package Praktikum04.Cafe;

public class Kasir {
    private String idKasir;
    private String nama;

    public Kasir(String idKasir, String nama) {
        this.idKasir = idKasir;
        this.nama = nama;
    }

    public String getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return nama + " (" + idKasir + ")";
    }
}
