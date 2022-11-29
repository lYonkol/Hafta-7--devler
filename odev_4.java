package week_8;

import java.util.Scanner;

public class odev_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen serinin kaç adım gideceğini  giriniz");
        int n = input.nextInt();
        double t = 0;
        for (int i = 0; i < n; i++) {
            t = t + 1 / ((2 * i + 1) * (2 * i + 2));

        }
        System.out.println(t);
    }

}
