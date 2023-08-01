//Rizka Oktaviani
//227064516108

package Empat_Abstrak;
abstract class Kendaraan {
    //Abstrak kelas Kendaraan yang memiliki method yang akan diimplementasikan oleh kelas turunannya
    private String merk;
    private String model;
    private int tahunProduksi;

    public Kendaraan(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    //Abstrak method yang akan diimplementasikan oleh kelas turunan
    public abstract void tampilkanInformasi();

    //Getter dan setter untuk variabel-variabel private
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}

//Kelas turunan dari Kendaraan
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, String model, int tahunProduksi, int jumlahPintu) {
        super(merk, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    //Implementasi dari method tampilkanInformasi()
    @Override
    public void tampilkanInformasi() {
        System.out.println("Mobil " + getMerk() + " " + getModel());
        System.out.println("Tahun Produksi \t: " + getTahunProduksi());
        System.out.println("Jumlah Pintu \t: " + jumlahPintu);
    }
}

//Kelas turunan lainnya dari Kendaraan
class Motor extends Kendaraan {
    private boolean adaBox;

    public Motor(String merk, String model, int tahunProduksi, boolean adaBox) {
        super(merk, model, tahunProduksi);
        this.adaBox = adaBox;
    }

    //Implementasi dari method tampilkanInformasi()
    @Override
    public void tampilkanInformasi() {
        System.out.println("Motor " + getMerk() + " " + getModel());
        System.out.println("Tahun Produksi\t: " + getTahunProduksi());
        System.out.println("Ada Box \t: " + (adaBox ? "Ya" : "Tidak"));
    }
}
