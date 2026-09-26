
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int nu = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev + rem;
            n = n / 10;

        }
        if (nu == rev) {
            System.out.println("Palindrome" + Math.abs(rev));
        } else {
            System.out.println("Not a palindrome " + rev);
        }
    }
}
