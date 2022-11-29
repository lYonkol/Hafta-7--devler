
import java.util.Scanner;

public class odev33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int sayac = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }

            }
            if (i % sayac == 0) {
                System.out.println(i + "sayısı tau sayısıdır");
            }

        }

    }
}
