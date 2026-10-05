
import java.util.*;

public class NumOfDayInMonth {

    void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = switch (a) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 4, 6, 9, 11 ->
                30;
            case 2 -> {
                if (b % 4 == 0) {
                    yield 29;
                } else {
                    yield 28;
                }

            }
            default ->
                0;
        };
        System.out.print("No.of Day in month is " + c);

    }
}
