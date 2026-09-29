
import java.util.*;

public class InvertedHalfWithnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(j);

            }
            k--;
            System.out.println(" ");
        }
    }
}
