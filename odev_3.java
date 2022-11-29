package week_8;

import java.util.Scanner;
import java.util.Random;

public class odev_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char random = (char) Math.floor(Math.random() * (25) + 65);
        int deneme = 0;
        while(true){
            System.out.println("Lutfen Buyuk harfi tahmin edin");
            char tahmin = input.next().charAt(0);
            deneme++; 
            if(deneme == 10){
                System.out.println("Deneme hakkınız bitti...");
                System.out.println("Kaybettiniz...");
                System.out.println("Harf="+random);
                break;
            }
            if(tahmin == random){
                System.out.println("Tebrikler doğru tahmin ettiniz");
                System.out.println(deneme+".denemenizde buldunuz");
            }
           
        }

    }

}
