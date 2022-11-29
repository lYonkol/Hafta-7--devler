
import java.util.Scanner;

public class odev46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        int a = 1;
        int b = -1;

        System.out.println("Negafibonacci sayıları");
        for (int i = 1; i < x - 1; i++) {

            int f3 = a - b;
            System.out.print(f3 + ",");
            a = b;
            b = f3;

        }

    }
}
