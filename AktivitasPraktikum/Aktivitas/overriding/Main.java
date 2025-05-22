package Aktivitas.overriding;

class Animal {
    public void suara() {
        System.out.println("cetak suara");
    }

    public void makan(String lauk) {
        System.out.println("hewan makan" + lauk); 
    }
}

class Dog extends Animal {
    @Override 
    public void suara() {
        System.out.println("guk guk");
    }

    public void makan(String lauk, String minuman) {
        System.out.println("hewan makan" + lauk + "dan minuman" + minuman); // overloading
    }   
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();

        Animal d = new Dog();
        d.suara();
        d.makan("Ayam Goreng");
        d.makan("kamu");
    
        Dog Anjing = new Dog();
        Anjing.makan("Tulang", "minum"); 
    
    }
}