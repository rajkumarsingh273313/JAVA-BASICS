
import java.util.*;

public class AtmWith {

    void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 5 == 0) {
            float c = (float) (b - a - 0.5);
            System.out.println("Balance : " + c);
        } else {
            System.out.println("Withdrawal amount should be multiples of 5 ");
        }

    }
}
