package Aktivitas.binding;

class Animal {
    static void suara() {
        System.out.println("cetak suara");
    }

    void makan() {
        System.out.println("hewan makan");
    }
}

class Dog extends Animal {
    @Override
    void makan() {
        System.out.println("anjing makan daging");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal.suara(); 
        a.makan();

        Animal b = new Dog();
        b.makan(); 

    }    
}