package com.company;

import java.util.Scanner;

public class Nozero {

    public static void affichage() {
        try {

            int age;
            System.out.print("enter number >> ");
            Scanner inputDevice = new Scanner(System.in);
            age = inputDevice.nextInt();
            inputDevice.nextLine();
            if (age<=0) throw new ZeroAgeException();
            System.out.println("Age >> " + age + " ans");

        }catch (ZeroAgeException ex){ ex.printStackTrace(); }
    }
    public static class ZeroAgeException extends Exception{
        public ZeroAgeException(){
            super("L'age doit etre superieur Zero");
        }
    }
}
