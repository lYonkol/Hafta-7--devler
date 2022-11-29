
import java.util.Scanner;

public class odev38 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sayac = 0;
        int s = 0;
        int toplam = 0;
        int deger = 1;
        for (int i = 100; i <= 9999; i++) {
            s = i;
            int k = 3;
            int z = 4;
            while (s > 0) {
                deger = s % 10;
                s = s / 10;

                if (i < 1000) {
                    for (int j = 0; j < k; j++) {
                        System.out.println(toplam += deger *= 10);
                    }

                    k--;
                } else {

                    for (int o = 0; o < z; o++) {
                        deger *= 10;
                    }
                    z--;
                }
                toplam = toplam + deger;
            }
            if (toplam == i) {
                System.out.println(i + "palindrom sayısıdır");
            }
        }
    }
}
