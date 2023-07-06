//Claura Tri Tispriatina 227064516061
//Rizka Oktaviani 227064516108

package GajiKaryawan;

public class Main {

    public static void main(String[] args) {
        
        //membuat objek dari class Karyawan
        Karyawan pledis1 = new Karyawan();
        //mengisi nip, nama, jenis kelamin, dan hari
        pledis1.NIP = "ARA061";
        pledis1.nama = "Claura";
        pledis1.jenkel = "Perempuan";
        pledis1.jmlhHari = 30;
        //menggunakan fungsi
        pledis1.karyawan();
        pledis1.absenKerja();
        pledis1.hitungGaji();
        System.out.println("");
        
        //membuat objek dari class Dosen
        Dosen pledis2 = new Dosen();
        pledis2.NIP = "RZZ108";
        pledis2.nama = "Rizka";
        pledis2.jenkel = "Perempuan";
        pledis2.jmlhHari = 12;
        pledis2.golongan = "G2";
        pledis2.jmlhSKS = 4;
        pledis2.upahPerSKS = 250000;
        pledis2.karyawan();
        pledis2.absenKerja();
        pledis2.hitungGaji();
        System.out.println("");
        
        //membuat objek dari class Staff
        Staff pledis3 = new Staff();
        pledis3.NIP = "SCH885";
        pledis3.nama = "Scoups";
        pledis3.jenkel = "Pria";
        pledis3.jmlhHari = 27;
        pledis3.karyawan();
        pledis3.absenKerja();
        pledis3.hitungGaji();
        System.out.println("");
    } 
}
