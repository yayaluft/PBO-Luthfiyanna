package Praktikum8.Tugas;

public class MainDemo {
    public static void main(String[] args) {
        Guru guru1 = new Guru("Budi Santoso", "SMAN 1 Malang", 3000000, "2121212121", 20);
        System.out.println(guru1.getInfo());

        Guru guru2 = new Guru("Siti Aminah", "SMPN 3 Malang", 2800000, "2020202020", 24);
        System.out.println(guru2.getInfo());

        Dokter dokter1 = new Dokter("Meliza Haizi", "RS Pelita", 6000000, "1324532135", 20);
        System.out.println(dokter1.getInfo());

        Dokter dokter2 = new Dokter();
        dokter2.nama = "Nadia Alya";
        dokter2.sip = "324367839";
        dokter2.gaji = 7000000;
        dokter2.tempatKerja = "RS Melati";
        dokter2.pasien = 20;
        System.out.println(dokter2.getInfo());
    }
}