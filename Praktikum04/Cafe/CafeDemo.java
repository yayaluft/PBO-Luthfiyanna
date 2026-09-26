package Praktikum04.Cafe;

public class CafeDemo {
    public static void main(String[] args) {
        Kasir kasir1 = new Kasir("K001", "Dimas");
        Kasir kasir2 = new Kasir("K002", "Sinta");

        Pelanggan pelanggan1 = new Pelanggan("P001", "Yaya");
        pelanggan1.tambahPesanan(kasir1, "Kopi Susu");
        pelanggan1.tambahPesanan(kasir2, "Roti Bakar");

        System.out.println(pelanggan1.getInfo());

        Pelanggan pelanggan2 = new Pelanggan("P002", "Rina");
        System.out.println(pelanggan2.getInfo());

        System.out.println(kasir2.getInfo());
    }

}
