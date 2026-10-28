/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author plont
 */

    
abstract class Kendaraan {
    abstract void berjalan ();
       
    void info () {
       System.out.println("Ini adalah kendaraan.");
    }
}



class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}
    
// ================================================================================================

abstract class Hewan {
    abstract void suara();
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk Guk");
    }
}
    
public class PraktikumPBO_9 {
    public static void main(String[] args) {
        Hewan rigby = new Kucing();
        rigby.suara();
        
        Hewan dawg = new Anjing();
        dawg.suara();
    }
}
