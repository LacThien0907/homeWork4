import java.util.Scanner;

public class BAI2E {public static void main(String[] args) {
    int n, sum = 0, count = 1;
    Scanner scanner = new Scanner(System.in);

    // n còn nhỏ hơn 1 thì còn nhập lại
    do {
        System.out.println("Mời bạn nhập vào số n: ");
        n = scanner.nextInt();
    } while (n < 1);

    /*
     * tính giá trị của biểu thức
     * i còn nhỏ hơn hoặc bằng n thì còn thực hiện thân vòng lặp
     */
    for (int i = 1; i <= n; i++) {
        count *= i;
        sum += count;
    }

    System.out.println("Tổng = " + sum);
}
}
