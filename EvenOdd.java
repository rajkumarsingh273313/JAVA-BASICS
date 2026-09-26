
import java.util.*;

public class EvenOdd {

    public static boolean IsEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (IsEven(n) == true) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }
    }
}
