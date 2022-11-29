
import java.util.Scanner;

public class odev47 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i < x - 2; i++) {
            int t4 = a + b + c;
            System.out.print(t4 + "-");
            a = b;
            b = c;
            c = t4;

        }

    }
}
