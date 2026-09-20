
import java.util.*;

public class Binomial {

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static int bin(int n, int r) {
        int nfact = fact(n);
        int rfact = fact(r);
        int vfact = fact(n - r);
        int binco = nfact / (rfact * vfact);
        return binco;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random() * 10) + 1;
        System.out.println(n);
        int num = sc.nextInt();
        int fa = fact(num);
        System.out.println("Factorial : " + fa);
        int r = sc.nextInt();
        int bincof = bin(num, r);
        System.out.println(bincof);
    }
}
