
import java.util.*;

public class SumDigit {

    void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = a;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            sum += rem;
            a = a / 10;

        }
        System.out.println("sum of the digit : " + c + " is : " + sum);
    }
}
