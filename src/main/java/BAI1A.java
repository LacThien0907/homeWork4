
//BAi1A
import java.util.Scanner;
public class BAI1A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, reversed = 0, original;
        System.out.println("\n\nNhập vào số cần kiểm tra: ");
        num1 = sc.nextInt();
        original = num1;
        while(num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }

        if(reversed == original){
            System.out.println(original+ " là số đối xứng!!");
        }

        else{
            System.out.println(original+ " không phải là số đối xứng!!");
        }

    }

    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

}