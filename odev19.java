package week7odevler;

public class odev19 {

    public static void main(String[] args) {
        for (int i = 2; i <= 7; i += 2) {
            for (int j = 2; j <= i; j += 2) {
                System.out.println(i + "" + j);
                if (j == 2) {

                    j++;
                    System.out.println(i + "" + j);
                }
            }
            if (i == 2) {
                i++;
            }

        }

    }

}
