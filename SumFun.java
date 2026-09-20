
import java.util.*;

public class SumFun {

    public static int Sum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int funsum = Sum(a, b);

        System.out.println("Sum of " + funsum);

    }
}
