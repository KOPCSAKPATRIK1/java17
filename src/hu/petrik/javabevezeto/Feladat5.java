package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("kérem a oldal ");
        var a = sc.nextDouble();
        sc.nextLine();
        System.out.print("kérem b oldal ");
        var b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kerulet k vagy terulet t? ");
        String muvelet = sc.nextLine();

        if (muvelet.equals("k"))
        {
            double kerulet = 2 * (a + b);
            System.out.printf("A teglalap kerulete %.2f cm\n", kerulet);
        }
        else if (muvelet.equals("t"))
        {
            double terulet = a * b;
            System.out.printf("terulet %.3f cm2\n", terulet);
        }
        else
        {
            System.out.println("hiba\n");
        }
        if (a == b)
        {
            System.out.println("ez egy negyzet");
        }
    }
}
