package week_8;

import java.util.Scanner;

public class odev_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen n degerini girinz");
        int n = input.nextInt();
        System.out.println("Lutfen x degerini giriniz");
        int x = input.nextInt();
        double sonuc;
        sonuc = Math.pow(1+x/n,n);
        System.out.println(sonuc);
    }

}
