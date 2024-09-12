package com.example;

public class PetMain {

    public static void main(String[] args) {
        // Spider nesnesi oluşturma
        Spider spider = new Spider();

        // Cat nesnesi oluşturma
        Cat cat = new Cat();

        // Ambulatory referansı oluşturma ve örnekleme yapma
        Ambulatory ambulatory = new AmbulatoryImpl(4); // Örneğin, genel bir ambulatory nesnesi

        // Spider üzerinden walk metodunu çağırma
        spider.walk();

        // Cat üzerinden walk metodunu çağırma
        cat.walk();

        // Ambulatory referansı üzerinden walk metodunu çağırma
        ambulatory.walk();


    }

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet p = (Pet) a;p.play();
       } else {
            //System.out.println("Danger! Wild Animal");
       }
    }
}