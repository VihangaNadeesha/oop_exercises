package com.example.oop;
public class Phone {
    String name;
    String color;
    int ram;

    public void call()
    {
        System.out.println("take a call from "+name);
        System.out.println("take a call from "+color+" "+name+" phone");
    }
    public void browseInternet()
    {
        System.out.println("browse internet from "+ram+"GB Phone");
    }

    public static void main(String[] args) {
        //create object
        Phone phone1 = new Phone(); //called to the constructor
        phone1.name = "Samsung";
        phone1.color = "Black";
        phone1.call();

        Phone phone2 = new Phone();
        phone2.name = "LG";
        phone2.color = "Red";
        phone2.call();

        Phone phone3 = new Phone();
        phone3.color = "Grey";
        phone3.name = "Nokia";
        phone3.ram = 3;
        phone3.browseInternet();
    }
}

