
import java.util.Scanner;

public class odev42 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int k0 = 0;
        int k1 = 1;
        System.out.println(k1);
        for (int i = 1; i < x; i++) {
            int k2 = 34 * k1 - k0 + 2;
            System.out.println(k2);
            k0 = k1;
            k1 = k2;
        }

    }
}
