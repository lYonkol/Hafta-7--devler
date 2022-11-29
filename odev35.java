
import java.util.Scanner;

public class odev35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        double sayac = 0;
        int s = 0;
        double toplam = 0;
        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {

                sayac = sayac + (1 / i);
                s++;
            }
        }
        toplam = s / sayac;
        for (int i = 1; i <= x; i++) {
            if (toplam == i) {
                System.out.println(toplam + " ore sayısıdır");
            }
        }
    }
}
