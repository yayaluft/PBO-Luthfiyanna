package Praktikum07.Tugas;

public class MainDemo {
    public static void main(String[] args) {
        Guru guru1 = new Guru("Budi Santoso", "SMAN 1 Malang", 3000000, "2121212121", 20);
        System.out.println(guru1.getInfo());
        
        Guru guru2 = new Guru("Siti Aminah", "SMPN 3 Malang", 2800000, "2020202020", 24);
        System.out.println(guru2.getInfo());
    }
}
