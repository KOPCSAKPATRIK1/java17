package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladatok6 {
    public static void main(String[] args) {
        System.out.print("Eredmeny 0-100\n");
        Scanner sc = new Scanner(System.in);
        int bekert = sc.nextInt();
        if (bekert < 43)
        {
            System.out.print("elegtelen");
        }
        else if (bekert < 58)
        {
            System.out.print("elegseges");
        }
        else if (bekert < 73)
        {
            System.out.print("kozepes");
        }
        else if (bekert < 89)
        {
            System.out.print("jo");
        }
        else
        {
            System.out.print("jeles");
        }

    }
}
