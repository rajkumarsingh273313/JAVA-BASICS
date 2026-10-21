
import java.util.*;

public class MaxSubarray {

    public static void BruteForce(int n, int a[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = 0; j < n; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += a[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Maximum sub array is " + maxSum);
    }

    public static void Prefix(int n, int a[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int Prefix[] = new int[n];
        Prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            Prefix[i] = Prefix[i - 1] + a[i];
        }
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = 0; j < n; j++) {
                int end = j;
                currSum = start == 0 ? Prefix[end] : Prefix[end] - Prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("Maximum sub array is " + maxSum);
    }

    public static void kadanes(int n, int a[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < n; i++) {
            cs = cs + a[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sub array is " + ms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // BruteForce(n, a);
        //  Prefix(n, a);
        kadanes(n, a);
    }
};
