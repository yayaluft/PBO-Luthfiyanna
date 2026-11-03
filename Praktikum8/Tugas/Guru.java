package Praktikum8.Tugas;

public class Guru extends Karyawan {
    public String nip;
    public int jtm;
 
    public Guru() {
        System.out.println("Constructor Guru tanpa parameter");
    }
 
    public Guru(String nama, String tempatKerja, int gaji, String nip, int jtm) {
        super(nama, tempatKerja, gaji);
        this.nip = nip;
        this.jtm = jtm;
        System.out.println("Constructor Guru berparameter");
    }

    public void hitungGaji() {
        gaji = gaji + (jtm * 50000);
    }
 
    public String getInfo() {
        String info = super.getInfo();
        info += "NIP          : " + nip + "\n";
        info += "JTM          : " + jtm + "\n";
        info += "Total Gaji   : " + gaji + "\n";
        return info;
    }
}
