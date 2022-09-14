package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter átmérő: ");
                double medenceAtmero = sc.nextDouble();
                System.out.print("Enter magasság: ");
                double medenceMagassag = sc.nextDouble();
                double sugar = medenceAtmero / 2;
                double alapTerulet = sugar * sugar * Math.PI;
                double terfogat = alapTerulet * medenceMagassag;
                System.out.printf("Terfogat %.3f", terfogat );





    }
}
