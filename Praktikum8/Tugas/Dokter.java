package Praktikum8.Tugas;

public class Dokter extends Karyawan {
    public String sip;
    public int pasien;

    public Dokter() {
        System.out.println("Constructor Dosen tanpa parameter");
    }

    public Dokter(String nama, String tempatKerja, int gaji, String sip, int pasien) {
        super(nama, tempatKerja, gaji);
        System.out.println("Constructor Dokter berparameter");
        this.sip = sip;
        this.pasien = pasien;
    }

    public void hitungGaji() {
        gaji = gaji + (pasien * 40000);
    }

    public String getInfo() {
        String info = super.getInfo();
        info += "SIP          : " + sip + "\n";
        info += "Jumlah pasien: " + pasien + "\n";
        info += "Total Gaji   : " + gaji + "\n";
        return info;
    }
}
