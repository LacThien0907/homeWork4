import java.util.Scanner;

public class BAI5 {

    public static void main(String[] args) {

        int n;
        int res;
        Scanner sc;
        do {
            System.out.print("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);

        res = inverse_num(n);
        System.out.println("Inverse number of " + n + " is " + res);

        sc.close();
    }

    public static int inverse_num(int n) {
        int inverse_num = 0;
        while(n > 0) {
            inverse_num = n%10 + inverse_num*10;
            n = n/10;
        }
        return inverse_num;
    }
}