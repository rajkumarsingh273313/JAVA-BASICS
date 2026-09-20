
import java.util.*;

public class BintoDec {

    public static void to(int n) {
        int num = n;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int last = n % 10;
            dec += last * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;

        }
        System.out.println("binary :" + num + " To Decimal :" + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        to(n);
    }
}
