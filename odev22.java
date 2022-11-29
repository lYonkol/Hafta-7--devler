
import java.util.Scanner;

public class odev22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen aralığı belirtin");
        int u = input.nextInt();
        int k = 0;
        boolean asal = true;
        boolean sal2 = true;
        for (int i = 2; i < u; i++) {
            for (int j = 2; j < i; j++) {
                k += 2;
                if (k % j == 0) {
                    sal2 = false;
                }
                if (i % j == 0) {
                    asal = false;

                }
            }
            if (asal == true && sal2 == true) {
                System.out.println(i + " ile " + k + " ikiz asal sayılardır");
            } else {
                System.out.println(" ikiz asal sayı değildir");
            }
        }

    }
}
