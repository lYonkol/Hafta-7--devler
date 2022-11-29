
import java.util.Scanner;

public class odev31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen değer giriniz");
        int x = input.nextInt();
        System.out.println("lütfen değer giriniz");
        int y = input.nextInt();
        int mod1 = x % 10;
        int mod2 = y % 10;
        int mod3 = (x / 10);
        int mod4 = y / 10;
        if (mod1 + mod2 == 10 && mod3 == mod4) {
            System.out.println("bağdaş sayılardır");
        }

    }
}
