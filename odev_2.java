package week_8;

import java.util.Scanner;

public class odev_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen n degerini giriniz");
        double n = input.nextInt();
        System.out.println("Lutfen x degeriniz giriniz");
        double x = input.nextInt();
        double t = 1;
        double f = 1;
        for (int i = 1; i < n; i++) {
            f = f * i;
            t = Math.pow(t + x, i / f);
        }
        System.out.println(t);
    }

}
