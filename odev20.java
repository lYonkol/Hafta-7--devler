
import java.util.Scanner;

public class odev20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen sayı giriniz");
        int u = input.nextInt();
        for (int i = 2; i < u; i++) {
            if (u % i == 0) {

                System.out.println(i);
            }
        }

    }
}
