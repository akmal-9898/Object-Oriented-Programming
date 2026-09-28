/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author plont
 */
class animal {
    public void Sound() {
        System.out.println("Sound of animal");
    }
    
    public void Eat(String food) {
        System.out.println("What does that animal eat : " + food);
    }
    
    public void Eat(int amount, String food) {
        System.out.println("How much food : " + amount + " for " + food);
    }
}

class Cat extends animal {
    @Override
    public void Sound() {
        System.out.println("miaw");
    }
}

class Dog extends animal {
    @Override
    public void Sound() {
        System.out.println("guk");
    }
}

//=======================================================================================

class Produk {
    String nama;
    int harga;
    int diskon;
    
    public void name_produk() {
        System.out.println("Nama barang : " + nama);
    }
    
    public void price() {
        System.out.println("Harga barang tergantung barang");
    }
    
    public void hitungDiskon() {
        System.out.println("Kamu dapat diskon");
    }
    
    public void total() {
        System.out.println("Ini total harga");
    }
}

class Buku extends Produk {
    @Override
    public void price() {
        System.out.println("Harga barang : " + harga);
    }
    
    @Override
    public void hitungDiskon() {
        System.out.println("Diskon yang didapat : " + diskon + "%");
    }
}

class Elektronik extends Produk {
    @Override
    public void price() {
        System.out.println("Harga barang : " + harga);
    }
    
    @Override
    public void hitungDiskon() {
        System.out.println("Diskon yang didapat : " + diskon + "%");
    }
}

class Pakaian extends Produk {
    @Override
    public void price() {
        System.out.println("Harga barang : " + harga);
    }    
    
    @Override
    public void hitungDiskon() {
        System.out.println("Diskon yang didapat : " + diskon + "%");
    }
}

class KeranjangBelanja extends Produk {
    @Override
    public void total() {
        int nominalDiskon = (harga * diskon) / 100;
        int totalAkhir = harga - nominalDiskon;
        System.out.println("Total harga setelah diskon: Rp " + totalAkhir);
    }
}

public class PraktikumPBO_6 {
    public static void main(String[] args) {
        Produk book = new Buku();
        book.nama = "Kitab Ngawi";
        book.harga = 1000000;
        book.diskon = 30;
        
        book.name_produk();
        book.price();
        book.hitungDiskon();
        
        KeranjangBelanja b = new KeranjangBelanja();
        b.harga = book.harga;
        b.diskon = book.diskon;
        b.total(); 
        
        Produk electronic = new Elektronik();
        electronic.nama = "Flipper zero";
        electronic.harga = 3036930;
        electronic.diskon = 5;
        
        electronic.name_produk();
        electronic.price();
        electronic.hitungDiskon();
        
        KeranjangBelanja e = new KeranjangBelanja();
        e.harga = electronic.harga;
        e.diskon = electronic.diskon;
        e.total(); 
        
        Produk shirt = new Pakaian();
        shirt.nama = "baju spartan";
        shirt.harga = 950000;
        shirt.diskon = 10;
        
        shirt.name_produk();
        shirt.price();
        shirt.hitungDiskon();
        
        KeranjangBelanja p = new KeranjangBelanja();
        p.harga = shirt.harga;
        p.diskon = shirt.diskon;
        p.total(); 
    }
}
