/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum10;

/**
 *
 * @author plont
 */

interface OperasiHitung {
    int hitung(int a, int b); 
}

class Penjumlahan implements OperasiHitung {
    @Override 
    public int hitung(int a, int b) { 
        return a + b; 
    } 
}

class Pengurangan implements OperasiHitung {
    @Override 
    public int hitung(int a, int b) { 
        return a - b; 
    } 
}

// ====================================================================================

interface Pembayaran {
    double hitungPajak(double harga);
}

class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga){
        return harga * 0.1;
    }
}

class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05;
    }
}

public class PraktikumPBO_10 { 
    public static void main(String[] args) {
        
        Pembayaran pajak_elektronik = new Elektronik(); 
        System.out.println("Penjumlahan: Rp " + pajak_elektronik.hitungPajak(1000000)); 
        
        Pembayaran pajak_makanan = new Makanan(); 
        System.out.println("Penjumlahan: Rp " + pajak_makanan.hitungPajak(5000)); 
    } 
}