package Praktikum09;

public class Demo9 {
    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Sharp";
        kulkas.harga = 3500000;
        kulkas.warna = "Silver";
        kulkas.jumlahPintu = 2;

        TV tv = new TV();
        tv.merk = "Samsung";
        tv.harga = 5000000;
        tv.warna = "Hitam";
        tv.jenisLayar = "LED";
        tv.volume = 10;

        System.out.println(kulkas.getInfo());
        System.out.println(tv.getInfo());
    }
}