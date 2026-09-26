
import java.util.*;

public class Avg {

    public static void average(int n, int n1, int n2) {
        float ave = (n + n1 + n2) / 3.0f;

        System.out.println("Average of " + n + " " + n1 + " " + n2 + " is : " + (n + n1 + n2) / 3.0f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10) + 1;
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        average(num3, num1, num2);
    }
}
