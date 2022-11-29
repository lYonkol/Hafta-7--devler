
import java.util.Scanner;

public class odev26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayıyı giriniz");
        int u = input.nextInt();
        int toplam = 1;
        int deger = 1;
        int deger2 = 2;
        for (int i = 1; i <= u; i++) {
            deger *= 2;
            for (int j = 1; j < deger; j++) {
                deger2 *= 2;
                deger2++;

            }
            System.out.println(i + "değerinin fermat değeri=" + deger2);
            deger = 1;
            deger = 2;
        }

    }
}
