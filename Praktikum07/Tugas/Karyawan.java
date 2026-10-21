package Praktikum07.Tugas;

public class Karyawan {
    public String nama;
    public String tempatKerja;
    public int gaji;
 
    public Karyawan() {
        System.out.println("Constructor Karyawan tanpa parameter");
    }
 
    public Karyawan(String nama, String tempatKerja, int gaji) {
        this.nama = nama;
        this.tempatKerja = tempatKerja;
        this.gaji = gaji;
        System.out.println("Constructor Karyawan berparameter");
    }
 
    public int hitungGaji() {
        return gaji;
    }
 
    public String getInfo() {
        String info = "";
        info += "Nama         : " + nama + "\n";
        info += "Tempat Kerja : " + tempatKerja + "\n";
        info += "Gaji Pokok   : " + gaji + "\n";
        return info;
    }
}