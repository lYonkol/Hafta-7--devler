
package week_8;

import java.util.Scanner;
public class odev_5 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen n degerini giriniz");
        int n = input.nextInt();
        for (int a = 1; a < n; a++) {
            for (int b = a+1; b < n-a; b++) {
                int c =n*(a+b);
                if( b*b + a*a == c*c ){
                    System.out.println(a+b+c+(a*b*c));
                }
                
            }
            
        } 
       
    }
    
}
