import java.util.Scanner;

/**
 * created by Rida Warsi
 * Date : 2020-11-10
 * Time : 12:01
 * Project : KVALIT20-OOP-Inlämningsuppgift3
 * Copyright : MIT
 */

public class SkattDemo {
    public static void main(String[] args) {

       //skapa en scanner som läser från kommandofönstret.

        Scanner ds = new Scanner(System.in);
        Scanner minScanner = new Scanner(System.in);

        System.out.println("Ange ditt namn");
        String name = minScanner.nextLine();

        System.out.println("Ange ditt Årsinkomst");
        String inkomst = minScanner.nextLine();
        int aik =  Integer.parseInt(inkomst);


        Skatt skattObj  = new Skatt();
        skattObj.namn = name;
        skattObj.åik = aik;
        skattObj.grundAvdrag = 13_400;
        skattObj.nsg  = 455_000;
        skattObj.ösg = 662_300;


        // skriv ut objekt
        System.out.println("Namn:" + skattObj.getName() );
        System.out.println("Besk:" + skattObj.getBesk() + " kr ");
        System.out.println("InkomstSkatt:" + skattObj.getInkomstskatt() );
        System.out.println("Årsinkomst:" + skattObj.getInkomst() + " kr ");
    }
}

