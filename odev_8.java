
package week_8;
import java.util.Scanner;
public class odev_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen f2 degerini giriniz");
        int f2= input.nextInt();
        double ao = 1+Math.pow(5, 5);
        int f1 = f2/(int)ao;
        int f3 = f2*(int)ao;
        System.out.println(f1+f2+f3);
                
    }
    
}
