package week7odevler;

import java.util.Scanner;

public class odev10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen harfi tahmin ediniz");
        int n = input.nextInt();
        int c = 1;

        for (int i = 1; i < n; i++) {
            int c1 = 4 * i * i;
            c = c * c1 / (c1 - 1);
        }
        System.out.println("john wallis gösterimi" + 2 * c);
    }
}
