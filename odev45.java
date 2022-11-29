
import java.util.Scanner;

public class odev45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println("fibonacci asal sayıları");
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < a; j++) {
                if (a % j == 0) {

                    System.out.print(a + "-");
                }
            }
            c = a;
            a = b;
            b += c;

        }

    }
}
