package hu.petrik.javabevezeto;

public class feladat9 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++)
        {
            boolean ellenorzes = (i % 3 == 0) && (i % 5 == 0);
            if (ellenorzes)
            {
                System.out.print(i + " ");
            }
        }


    }
}
