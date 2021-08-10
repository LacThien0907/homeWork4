import java.util.Scanner;


public class BAI2D {

    public static void main(String[] args) {

        long multi = 1;
        int n;
        Scanner sc;
        do {
            System.out.println("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);

        for(int i = 1; i <= n; i++) {
            multi = multi*i;
        }

        System.out.println("Mutil = " + multi);
        sc.close();
    }
}