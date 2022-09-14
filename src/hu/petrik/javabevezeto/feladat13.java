package hu.petrik.javabevezeto;

import java.util.Random;
import java.util.Scanner;

public class feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int low = 1;
        int high = 100;
        int kitalaltSzam = r.nextInt(high-low) + low;
        boolean ellenorzes;

        System.out.print("Kitalaltam egy szamot 1 - 100 kozott\nTALALD KI!\n");
        System.out.print(kitalaltSzam + "\n");
        System.out.print("Tippelj egy szamot\n");
        while (ellenorzes = true)
        {
            int valasztott = sc.nextInt();

            if (valasztott == kitalaltSzam)
            {
                ellenorzes = true;
                System.out.print("ugyes vagy fostalicska");
                break;
            }
            else if (kitalaltSzam > valasztott)
            {
                System.out.print("szar vagy\n");
                System.out.print("nagyobbat\n");
            }
            else  if (kitalaltSzam < valasztott)
            {
                System.out.print("szar vagy\n");
                System.out.print("kisebbet\n");
            }

        }






    }
}
