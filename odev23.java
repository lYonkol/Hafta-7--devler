
import java.util.Scanner;

public class odev23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sayıyı giriniz");
        int u = input.nextInt();
        int toplam = 0;
        for (int i = 1; i < u; i++) {

            if (u % i == 0) {
                toplam += i;

            }
        }
        if (u == toplam) {
            System.out.println("girdiğiniz sayı mükkemmel sayıdır");

        }

    }
}
