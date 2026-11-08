package Praktikum09.Tugas;

public class Kamera implements Rentable {
    public String merk;
    public boolean tersedia;

    @Override
    public void sewa() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Kamera " + merk + " berhasil disewa");
        } else {
            System.out.println("Kamera " + merk + " sedang tidak tersedia");
        }
    }

    @Override
    public void kembalikan() {
        tersedia = true;
        System.out.println("Kamera " + merk + " sudah dikembalikan");
    }

    public void gantiLensa() {
        System.out.println("Mengganti lensa kamera " + merk);
    }

    public void gantiBaterai() {
        System.out.println("Mengganti baterai kamera " + merk);
    }
}
