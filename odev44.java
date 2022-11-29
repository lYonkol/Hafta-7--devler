
import java.util.Scanner;

public class odev44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        int k = 0;
        while (x > 0) {
            k = x % 10;
            x = x / 10;
        }

        for (int i = 1; i <= k; i++) {
            if (a < k) {
                System.out.print(a + "-");
                c = a;
                a = b;
                b += c;
            }

        }
        System.out.print(a + "-");
    }
}
