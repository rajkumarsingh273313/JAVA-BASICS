
import java.util.*;

public class LinearSearch {

    public static int linear(int number[], int key) {
        for (int i = 0; i <= number.length; i++) {
            if (number[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[100];
        int n = sc.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            number[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int line = linear(number, key);
        if (line == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index : " + line);
        }

    }
}
