/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum3;

/**
 *
 * @author plont
 */

class Hewan {
    private String nama;
    private int umur;
    String jenis;
    String asal;
    String warna;
    String kelamin;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    void suara() {
        System.out.println("hewan bersuara");
    }

    void berlari() {
        System.out.println("Hewan sedang berlari");
    }
    
    void info() {
        jenis = "anggora";
        asal = "turki";
        warna = "putih";
        kelamin = "jantan"; 
        System.out.println(getNama() + " adalah kucing " + jenis + " berwarna " + warna + ". Dia berasal dari " + asal + ", berjenis kelamin " + kelamin + ", dan berumur " + getUmur() + " tahun");
    }
}


class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;

    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
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
    
    public int getTahun() { 
        return tahun;
    }
    
    public void setTahun(int tahun) { 
        this.tahun = tahun;
    }
    
    public String getWarna() { 
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
        
    void displayInfo() {
        System.out.println("itu adalah mobil bermerek " + merk + " dengan model " + model + " tahun " + tahun + " berwarna " + warna);
    }
    
    void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala");
    }
}

public class PraktikumPBO_3 {
    public static void main(String[] args) {
        Mobil jdm = new Mobil("Toyota", "AE86", 1990, "Putih-Hitam");
        jdm.displayInfo();        
        jdm.startEngine();
        jdm.setWarna("Merah-Hitam"); 
        jdm.displayInfo(); 
        System.out.println();
        jdm = new Mobil("Toyota", "Tacoma pikes peak", 1998, "Putih-Kuning");
        jdm.displayInfo();
        jdm.startEngine();
        jdm.setWarna("Merah-Hitam");
        jdm.displayInfo();
    }
}

    
    
    
    

