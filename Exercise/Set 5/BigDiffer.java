
/*
Chloe Anotnozzi
1670980

23/09/2021
Gets the biggest value between the numbers
*/
import java.util.*;

public class BigDiffer {
    Scanner scan = new Scanner(System.in);
    int bigDiff;
    int[] nums;

    void readArray() {
        int n;

        System.out.println("How many values?");
        n = scan.nextInt();
        nums = new int[n];

        System.out.println("Enter values");
        /** i numbers from input read and stored in nums[0..i-1] is */
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
    }

    void calculateBigDiff() {
        int max;
        int min;

        max = nums[0]; // guaranteed to exits
        min = nums[0];
        /**
         * max = max(nums[0....i-1]) && min = min(nums[0...i-1])
         */
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        bigDiff = max - min;
    }

    void printResult() {
        System.out.println("The biggest difference in these values is: ");
        System.out.println(bigDiff);
    }

    void readAndGiveBigDiff() {
        readArray();
        calculateBigDiff();
        printResult();

    }

    public static void main(String[] args) {
        (new BigDiffer()).readAndGiveBigDiff();
    }
}
