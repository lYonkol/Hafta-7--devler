
import java.util.Scanner;

public class odev21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen sayı giriniz");
        int u = input.nextInt();
        u += 2;
        int a = 1;
        for (int i = 2; i < u; i++) {
            if (u % i == 0) {
                a = 2;

            }
        }
        if (a == 1) {
            System.out.println("girdiğiniz sayı chen asal sayıdır");
        } else {
            System.out.println("girdiğiniz sayı chen asal sayı değildir");
        }

    }
}
