
import java.util.Scanner;

public class odev30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int mod = 1;
        int n = x;
        int toplam = 0;
        while (n > 0) {
            mod = n % 10;
            n = n / 10;

            mod = mod * mod * mod;

            toplam = toplam + mod;

        }
        if (toplam == x) {
            System.out.println(x + "armstong sayısınıdır");
        }

    }
}
