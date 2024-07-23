package com.example.oop;
//Getting User Input Example
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); //Object for Scanner class = x
        int age = x.nextInt();
//        String name = x.nextLine();
        System.out.println("Age is "+age);
    }
}
