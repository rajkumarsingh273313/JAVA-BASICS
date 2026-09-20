
/*import java.util.*;

public class CrtOne {

    public static void main(String[] args) {
        int num = 0;
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                    flag = 1;

                }
            }
            break;
        }
        if (flag == 0) {
            System.out.println(-1);
        } else {
            System.out.println(num);
        }
    }
}
 *//* 
import java.util.*;

public class CrtOne {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] == arr[j]) {
                    num = arr[i];
                }

            }
            break;
        }
        if (num == 0) {
            System.out.println(-1);
        } else {
            System.out.println(num);
        }

    }
}
 */
 /* 
import java.util.*;

public class CrtOne {

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();

        }
        int tar = sc.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1 - i; j++) {
                if ((arr[i] + arr[j]) == tar) {
                    num = 1;
                }
            }
            break;
        }

        if (num == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}*/
 /*import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ajj[] = new int[n];
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ajj[i] += arr[i];
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            ajj[i] = 0;
        }
        //for(int i=0;i<n;i++){
        System.out.print(1 + " " + 3 + " " + 12 + " " + 0 + " " + 0);
        //}

    }
}
 */

import java.util.*;

public class CrtOne {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1 - j; i++) {

                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(arr[i]);
        }

    }
}
