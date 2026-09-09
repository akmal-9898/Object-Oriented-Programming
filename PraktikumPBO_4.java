/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum4;

/**
 *
 * @author plont
 */


class Vehicle {
    private String nama;            
    protected int kecepatanMaks;    
    public String jenisMesin; 

    public Vehicle(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void show() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}


class Mobil extends Vehicle {
    private int jumlahPintu; 

    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);  
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfoMobil() {
        System.out.println("Nama Mobil: " + getNama());
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

//==================================================================================================================================

class human {
    private String name;
    protected int age;
    public String job;
    
    public human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

//    ------------------------------------------------------
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

class employe extends human {
    private int salary;
    
    public employe(String name, int age, String job, int salary) {
        super(name, age, job);
        this.salary = salary;
    }
//    --------------------------------------------------------
    
    private int getSalary() {
        return salary;
    }
    
    private void setSalary(int salary) {
        this.salary = salary;
    }   
    
    public String toString() {
        return "employee data =[" + 
               "Name: " + getName() + 
               ", age " + age + 
               ", job: " + job + 
               ", salary: " + salary +
               "]";
    }
    public String testing() {
        return "employee data =[" + 
               "Name: " + name + 
               ", age " + age + 
               ", job: " + job + 
               ", salary: " + salary +
               "]";
    }    
}

public class PraktikumPBO_4 {
    public static void main(String[] args) {
        employe someone = new employe("Rusdi", 35, "barber", 4350);
        System.out.println(someone.toString()); 
        System.out.println();

        someone.setName("Marcquez Goshen"); 
        System.out.println(someone.toString()); 
        System.out.println();
        employe person = new employe ("entity", 999, "unemploye", 999999999);
        System.out.println(person.testing());
    }
}
