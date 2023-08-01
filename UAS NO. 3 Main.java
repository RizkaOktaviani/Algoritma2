//Rizka Oktaviani
//227064516108

package Tiga_Program;
public class Main {
    public static void main(String[] args) {
    //membuat objek pegawai
    Pegawai pegawai1 = new Pegawai("Rizka", "perempuan", "226108", false);
    //mencetak informasi pegawai
    pegawai1.toShow();
    System.out.println();
    Pegawai pegawai2 = new Pegawai("Scoups", "laki-laki", "228895", true);
    pegawai2.toShow();
    System.out.println();
    Pegawai pegawai3 = new Pegawai("Risol", "laki-laki", "220895", false);
    pegawai3.toShow();
    System.out.println();

    //membuat objek programmer
    Programmer programmer1 = new Programmer("Rizka", "perempuan", "226108", false, 2, 2500000);
    //mencetak informasi programmer
    programmer1.toShow();
    System.out.println();
    Programmer programmer2 = new Programmer("Scoups", "laki-laki", "228895", true, 8, 8000000);
    programmer2.toShow();
    System.out.println();
    Programmer programmer3 = new Programmer("Risol", "laki-laki", "220895", false, 5, 7600000);
    programmer3.toShow();
    System.out.println();
    }
}
