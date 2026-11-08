package Praktikum09.Tugas;

public class Mobil implements Rentable {
    public String platNomor;
    public boolean tersedia;

    @Override
    public void sewa() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Mobil " + platNomor + " berhasil disewa");
        } else {
            System.out.println("Mobil " + platNomor + " sedang tidak tersedia");
        }
    }

    @Override
    public void kembalikan() {
        tersedia = true;
        System.out.println("Mobil " + platNomor + " sudah dikembalikan");
    }

    public void isiBensin() {
        System.out.println("Mengisi bensin mobil " + platNomor);
    }

    public void servis() {
        System.out.println("Servis mobil " + platNomor);
    }
}
