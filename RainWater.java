
import java.util.*;

public class RainWater {

    public static int trappedRainWater(int n, int[] height) {
        // calculate left max boudary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate right  max boudary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel =min(leftmax boud, rightmax,boud)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
// trapped water
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("Trapped water :" + trappedRainWater(n, height));

    }
}
