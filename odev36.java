
import java.util.Scanner;

public class odev36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sayac = 0;
        int s = 0;
        int toplam = 0;
        for (int i = 1; i <= 50; i++) {
            for (int j = 1; j <= 50; j++) {
                for (int t = 1; t <= 50; t++) {
                    toplam = i * i + j * j + t * t;
                    if (toplam == i * j * t * 3) {
                        System.out.println(i + "-" + j + "-" + t + " sayılarından oluşan sonuc markov sayısıdır=" + toplam);
                    }

                }

            }

        }

    }
}
