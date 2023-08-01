//Rizka Oktaviani
//227064516108

package Tiga_Program;
public class Pegawai {  //super class/parent Pegawai
    //membuat variabel 
    private String nama;
    private String jenkel;
    private String noPegawai;
    private boolean nikah;

    public Pegawai(String nama, String jenkel, String noPegawai, boolean nikah) {
        //inisialisasi
        this.nama = nama;
        this.jenkel = jenkel;
        this.noPegawai = noPegawai;
        this.nikah = nikah;
    }

    public int getTunjangan() {
    if (nikah) {
        //mengecek apakah pegawai laki-laki/perempuan kemudian sesuaikan tunjangan
        if (jenkel.equals("laki-laki")) {
            return 300000;
        } else {
            return 220000;
        }
    } else {
        return 150000;
    }
}

  public void toShow() {
    /*mencetak nama, jenis kelamin, nomor pegawai, status menikah, dan tunjangan
    untuk pegawai dan programmer*/
    System.out.println("Nama \t\t: " + nama);
    System.out.println("Jenis kelamin \t: " + jenkel);
    System.out.println("No. pegawai \t: " + noPegawai);
    System.out.println("Status menikah \t: " + (nikah ? "Menikah" : "Belum menikah"));
    System.out.println("Tunjangan \t: " + getTunjangan());
  }
}

class Programmer extends Pegawai {  //programmer
    private int lamaKerja;
    private double gaji;

    public Programmer(String nama, String jenkel, String noPegawai, boolean nikah, int lamaKerja, double gaji) {
        super(nama, jenkel, noPegawai, nikah);
        this.lamaKerja = lamaKerja;
        this.gaji = gaji;
    }

    public double getBonus() {
        if (lamaKerja < 5) {
            return gaji * 0.05;
        } else {
            return gaji * 0.1;
        }
    }

    public void toShow() {
        //memanggil metode toShow dari kelas Pegawai menggunakan 'super'
        super.toShow();
        System.out.println("Lama Bekerja \t: " + lamaKerja);
        System.out.println("Gaji \t\t: " + gaji);
        System.out.println("Bonus \t\t: " + getBonus());
    }
}
