
import java.util.Scanner;

public class odev28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen sayısı giriniz");
        int x = input.nextInt();

        int toplam = 1;

        for (int i = 1; i <= x; i++) {
            toplam = 4 * i + 1;
            if (toplam == x) {
                System.out.println("hibrit sayıdır");
            }

        }

    }
}
