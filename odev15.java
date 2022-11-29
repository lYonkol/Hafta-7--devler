
import java.util.Scanner;

public class odev15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("lütfen AB kenarını giriniz");
        int ab = input.nextInt();
        double cb = 2 * ab / (1 + Math.sqrt(5));
        double ac = ab - cb;

        System.out.println("ac kenarı=" + ac + "cb kenarı=" + cb);
    }
}
