package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        int paros = 0;
        int paratlan = 0;
        while (osszeg >= 100)
        {
            int szam = sc.nextInt();
            osszeg += szam;
            if (szam % 2 == 0)
            {
                paros++;
            }
            else
            {
                paratlan++;
            }
            System.out.print(paros + " " + paratlan);
        }
    }
}
