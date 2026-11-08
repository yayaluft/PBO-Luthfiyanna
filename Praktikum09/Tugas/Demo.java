package Praktikum09.Tugas;

public class Demo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.platNomor = "N 1234 AB";
        mobil.tersedia = true;

        Kamera kamera = new Kamera();
        kamera.merk = "Canon";
        kamera.tersedia = true;

        mobil.sewa();
        mobil.sewa();       // gagal, sudah disewa
        mobil.kembalikan();
        mobil.isiBensin();
        mobil.servis();

        kamera.sewa();
        kamera.kembalikan();
        kamera.gantiLensa();
    }
}
