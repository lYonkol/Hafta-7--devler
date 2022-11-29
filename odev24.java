
import java.util.Scanner;

public class odev24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        int u = input.nextInt();
        int u2 = 1;
        int u3 = 1;
        int toplam = 1;
        boolean asal = true;
        for (int i = 1; i <= u; i++) {
            u2 *= 2;
        }
        for (int i = 1; i <= u; i++) {
            u3 *= 2;
        }
        u3--;
        for (int i = 1; i < u3; i++) {
            if (u3 % i == 0) {
                asal = false;
            }

        }
        if (asal) {
            toplam = u2 * u3;
            System.out.println(toplam + " mükkemmel sayıdır");
        } else {
            System.out.println(toplam + " mükkemmel sayı değildir");
        }

    }
}
