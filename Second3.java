
import java.util.*;

public class Second3 {

    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int value");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                IO.println("B is the Second Largest Element  : " + b);
            } else {
                IO.println("C is the Second Largest Element : " + c);
            }
        } else if (b > c && b > a) {
            if (a > c) {
                IO.println("A is the Second Largest Element  : " + a);
            } else {
                IO.println("C is the Second Largest Element : " + c);
            }
        } else {
            if (a > b) {
                IO.println("A is the Second Largest Element : " + a);
            } else {
                IO.println("B is the Second Largest Element : " + b);
            }
        }
    }
}
