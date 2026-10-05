
import java.util.*;

public class PosNeg {

    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int value");

        int a = sc.nextInt();
        if (a > 0) {
            IO.println("It's Postive number : " + a);
        } else if (a < 0) {
            System.out.println("It's Negative number : " + a);
        } else {
            System.out.println("It's ZERO");
        }
    }
}
