
import java.util.*;

public class StepsEve {

    void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        while (a > 0) {
            if (a % 2 == 0) {
                a = a / 2;
                count++;
            } else {
                a--;
                count++;
            }
        }

        System.out.println(count);
    }
}
