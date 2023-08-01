//Rizka Oktaviani
//227064516108

package Empat_Abstrak;

public class Main {

    public static void main(String[] args) {
    //Membuat objek mobil dan motor
    Kendaraan mobil = new Mobil("Honda", "Hyundai", 2020, 4);
    Kendaraan motor = new Motor("CBR150R", "Toyota", 2019, true);

    //Mencetak informasi kendaraan
    mobil.tampilkanInformasi();
    System.out.println();
    motor.tampilkanInformasi();
    }
}
