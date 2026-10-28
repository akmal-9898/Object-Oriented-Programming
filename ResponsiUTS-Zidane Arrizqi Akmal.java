/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package responsi_UTS;

/**
 *
 * @author plont
 */

// Buat kelas Produk dengan atribut namaProduk, harga, dan metode tampilkanInfo().
class Produk {

//  atribut
    private String namaProduk;       // Enkapkulasi (private) : mengisolasi atribut agar tidak mudah di akses sembarang class
    private int harga;
    
//  method
    public void tampilkanInfo() {
        System.out.println("Nama produk : " + namaProduk);
        System.out.println("Harga : " + harga);
    }
    
//  metode getter dan setter (getter sebagai perantara bagi atribut private)
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
}

// Buat kelas Pegawai dengan atribut namaPegawai, gaji, dan metode tampilkanInfo().
class Pegawai {
    
//  atribut
    private String namaPegawai;     // Enkapkulasi (private) : mengisolasi atribut agar tidak mudah di akses sembarang class
    private int gaji;
    
//  method
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Gaji : " + gaji + " IDR");
    }
    
//  metode getter dan setter (setter untuk mengubah data yang private namun tetap mempertahankan keamanannya)
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public int getGaji() {
        return gaji;
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}

// Buat dua kelas turunan dari Produk
class Elektronik extends Produk {
    
//    Tambahkan atribut garansi (dalam tahun)
    int garansi;
    
    @Override       // Dynamic Polymorphism : dinamis karena java memilih method mana yang akan digunakan tergantung ketersediaan data
    public void tampilkanInfo() {
        super.tampilkanInfo();        // super untuk agar method asli tidak sepenuhnya ditimpa 
        System.out.println("Garansi : " + garansi + " Tahun");
    }
}

class Makanan extends Produk {
    
//    Tambahkan atribut tanggalKadaluarsa
    int tanggalKedaluarsa;
    int bulanKedaluarsa;
    int tahunKedaluarsa;
    
    @Override       // kenapa milih overriding : karena soal terahir meminta kelas induk untuk memegang objek dari kelas turunan, menyebabkan parameter antar method harus sama
                    // jika dipaksakan pakai overloading maka akan terjadi erbedaan parameter sehingga terjadi error karena java tidak melihat parameter tersebut pada method 
                    // yang ada pada class induk
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("waktu kedaluarsa : " + tanggalKedaluarsa + "-" + bulanKedaluarsa + "-" + tahunKedaluarsa);
    }
}

// Buat dua kelas turunan dari Pegawai
class PegawaiTetap extends Pegawai {
    
//    Tambahkan atribut tunjangan
    int tunjangan;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan yang didapat : " + tunjangan + " IDR");
    }
}

class PegawaiKontrak extends Pegawai {
    
//    Tambahkan atribut lamaKontrak (dalam bulan)
    int lamaKontrak;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("lama kontrak : " + lamaKontrak + " bulan");
    }
}


// Implementasikan polimorfisme dengan menggunakan referensi kelas induk untuk memegang objek dari kelas turunan. Buat dua objek Produk dan dua objek Pegawai, kemudian gunakan 
// referensi induk untuk memanggil metode dari masing-masing objek kelas turunan
public class Responsi_UTS {
    public static void main(String[] args) {
       
//     objek produk 
       Produk security = new Elektronik();
       security.setNamaProduk("U2F");   // kenapa pakai setter : karena agar atribut yang di enkapkulasi berstatus private/tidak sembarangan bisa diakses
       security.setHarga(1350000);
       ((Elektronik) security).garansi = 2;     // Casting : digunakan agar polimorfisme yang menggunakan referensi produk dapat berjalan karena atibut 
       
       
       System.out.println();
//       Constructor kosong = Objek dibuat dalam keadaan "kosong" terlebih dahulu, lalu datanya disuntikkan satu per satu di baris-baris berikutnya
//       Kelengkapan Data : fleksibel jika datanya belum ada. Jika tidak dimasukkan, data akan bernilai 0 atau Null 
       
       Produk dessert = new Makanan();
       dessert.setNamaProduk("Pudding Coklat");
       dessert.setHarga(30000);
       ((Makanan) dessert).tanggalKedaluarsa = 5;
       ((Makanan) dessert).bulanKedaluarsa = 10;
       ((Makanan) dessert).tahunKedaluarsa = 2026;
       dessert.tampilkanInfo();
       
       System.out.println();
       
//     objek Pegawai
       Pegawai karyawan = new PegawaiTetap();
       karyawan.setNamaPegawai("Jason Luf");
       karyawan.setGaji(900000000);
       ((PegawaiTetap) karyawan).tunjangan = 50000000;
       karyawan.tampilkanInfo();
       
       System.out.println();
       
       Pegawai magang = new PegawaiKontrak();
       magang.setNamaPegawai("Anton");
       magang.setGaji(12000000);
       ((PegawaiKontrak) magang).lamaKontrak = 10;
       magang.tampilkanInfo();
       
//     Constructor berparameter = Objek dibuat dan seluruh data awalnya langsung diisi sekaligus dalam 1 baris kode yang ringkas
//     EX : employe someone = new employe("Rusdi", 35, "barber", 4350);
//     Kelengkapan Data: langsung menyediakan data yang wajib ada. Jika datanya kurang, program akan menolak dan error
       
    }
}
