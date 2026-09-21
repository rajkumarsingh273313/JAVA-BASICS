
import java.util.*;

public class DectoBin {

    public static void to(int n) {
        int num = n;
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin += (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;

        }
        System.out.println("decimal to binary : " + bin + "  number : " + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random() * 10) + 1;
        to(n);

    }
}
