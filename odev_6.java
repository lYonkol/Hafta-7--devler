package week_8;

import java.util.Scanner;

public class odev_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satır sayısını giriniz");
        int n = input.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(s);
                s++;

            }
            System.out.println();
        }
    }

}
