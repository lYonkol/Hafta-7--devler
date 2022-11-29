package week_8;

import java.util.Scanner;

public class odev_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen acı degerini girinz degerini giriniz");
        double x = input.nextDouble();
        System.out.println("Lutfen seri adım sayınısı giriniz");
        double n = input.nextDouble();
        double t = 1;
        x = Math.toRadians(x);
        int is = 1;
        for (int i = 1; i <= n-1; i++) {
            int f = 1;
            for (int j = 1; j <= 2 * i; j++) { 
               f *= j;
               is *=(-1);
               t += is* Math.pow(x, 2*i)/f;
                

            }

        }
        System.out.println("hesaplanan değer"+Math.cos(x));
        System.out.println(t);
    }

}
