package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        System.out.println("enter number >> ");
        Scanner inputDevice = new Scanner(System.in);
        inputDevice.nextLine();
        do {
            System.out.println("enter number >> ");
            number = inputDevice.nextInt();
            switch (number) {
                case 10:
                    System.out.print("dix"); break;
                case 20:
                    System.out.print("vingth"); break;
                case 30:
                    System.out.println("trente"); break;
                case 40:
                    System.out.println("quarante"); break;
                case 50:
                    System.out.println("cinqaunte"); break;
                case 60:
                    System.out.println("soixante"); break;
                case 70:
                    System.out.println("septempt"); break;
                case 80:
                    System.out.println("quatre vinght"); break;
                case 90:
                    System.out.println("nonante"); break;
                case 100:
                    System.out.println("cent"); break;
                default:
                    System.out.println("invalide number");break;
            }
        } while (number <= 100);
    }
}
