//Claura Tri Tispriatina 227064516061
//Rizka Oktaviani 227064516108

package GajiKaryawan;

public class Karyawan { //super class/parent class Karyawan
    //membuat atribut
    String NIP;
    String nama;
    String jenkel;
    int jmlhHari;
    int totalGaji;
    
    //membuat fungsi
    void karyawan() {
        //cetak nip, nama, dan jenis kelamin untuk karyawan dosen, dan staff
        System.out.println("NIP  : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenkel);
    }
    
    void absenKerja() {
        System.out.println("Absen Kerja   : " + jmlhHari);  
    }
    
    void hitungGaji() {
        System.out.println("Gaji Karyawan : " + (jmlhHari * 50000));
    }
}

    class Dosen extends Karyawan {
        String golongan;
        int jmlhSKS;
        int upahPerSKS;
    
    @Override
    void hitungGaji() {
        System.out.println("Gaji Karyawan : " + (upahPerSKS * jmlhSKS * jmlhHari));
    }
}

    class Staff extends Karyawan {
}
