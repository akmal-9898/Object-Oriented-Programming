/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author plont
 */
class Vehicle {
    String name;
    int speed;
    
    
    void showInfo() {
        System.out.println("name: " + name);
        System.out.println("top speed: " + speed);
    }
}

class landVehicles extends Vehicle {
   String platform;
   
   @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Vehicle type: " + platform);
    }
}

class Car extends landVehicles {
    int cardoor;
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("number of car doors: " + cardoor);
    }
}

class Bike extends landVehicles {
    String engine;
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("engine: " + engine);
    }
}

public class PraktikumPBO_5 {
    public static void main(String[] args) {
        Car Freedom = new Car();
        Freedom.name = "Dodge Viper";
        Freedom.speed = 331;
        Freedom.platform = "Land";
        Freedom.cardoor = 2;
        Freedom.showInfo();
        System.out.println();
        
//        ---------------------------------------------------------

        Bike Blitzkrieg = new Bike();
        Blitzkrieg.name = "BMW M1000RR";
        Blitzkrieg.speed = 314;
        Blitzkrieg.platform = "Land";
        Blitzkrieg.engine = "inline 4 cylinder - 4 stroke";      
        Blitzkrieg.showInfo();
    }
}

// ===============================================================================

class Animal {
    String name;
    String animal_type;
    
    
    public void showAnimal() {
        System.out.println("name: " + name);
        System.out.println("types of animals: " + animal_type);
    }
}

class Cat extends Animal {
    String catSound;
    
    public void animalSound() {
        System.out.println("Animal sound: " + catSound);
    }
    
    @Override
    public void showAnimal() {
        super.showAnimal();
    }
}

class Dog extends Animal {
    String dogSound;
    
    public void animalSound() {
        System.out.println("Animal sound: " + dogSound);
    }
    
    @Override
    public void showAnimal() {
        super.showAnimal();
    }
}


