package Praktikum04.Cafe;

import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> daftarPesanan;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.daftarPesanan = new ArrayList<Pesanan>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPesanan(Kasir kasir, String namaMenu) {
        Pesanan pesanan = new Pesanan();
        pesanan.setNoPesanan(idPelanggan + "-" + (daftarPesanan.size()) + 1);
        pesanan.setKasir(kasir);
        pesanan.setNamaMenu(namaMenu);
        daftarPesanan.add(pesanan);
    }

    public String getInfo() {
        String info = "";
        info += "Id Pelanggan   : " + this.idPelanggan + "\n";
        info += "Nama           : " + this.nama + "\n";

        if (!daftarPesanan.isEmpty()) {
            info += "Daftar Pesanan :\n";
            for (Pesanan pesanan : daftarPesanan) {
                info += pesanan.getInfo();
            }
        } else {
            info += "Belum ada pesanan";
        }

        info += "\n";
        return info;
    }
}
