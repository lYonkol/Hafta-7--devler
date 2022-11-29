package week_8;

import java.util.Scanner;

public class odev_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen terim sayisini giriniz");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.println(0);
            } else if (i == 1) {
                System.out.println(1);
            } else if (i>1) {
                double k = (Math.pow(1 + Math.sqrt(2), i-2) - Math.pow(1 - Math.sqrt(2), i-2)) / 2 * Math.sqrt(2)+ 2*((Math.pow(1 + Math.sqrt(2), i-1) - Math.pow(1 - Math.sqrt(2), i-1)) / 2 * Math.sqrt(2));
                System.out.println(k);
            }
        }
    }

}
