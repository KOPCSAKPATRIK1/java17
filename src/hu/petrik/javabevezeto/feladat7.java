package hu.petrik.javabevezeto;

import java.util.Scanner;

public class feladat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("melyik honap szamban\n");
        int bekert = sc.nextInt();
        switch (bekert)
        {
            case 1:
                System.out.print("januar");
                break;
            case 2:
                System.out.print("februar");
                break;
            case 3:
                System.out.print("marcius");
                break;
            case 4:
                System.out.print("aprilis");
                break;
            case 5:
                System.out.print("majus");
                break;
            case 6:
                System.out.print("junius");
                break;
            case 7:
                System.out.print("julius");
                break;
            case 8:
                System.out.print("augusztus");
                break;
            case 9:
                System.out.print("szeptermber");
                break;
            case 10:
                System.out.print("oktober");
                break;
            case 11:
                System.out.print("november");
                break;
            case 12:
                System.out.print("december");
                break;
        }

    }
}
