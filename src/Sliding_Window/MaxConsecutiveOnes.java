
package Sliding_Window;

import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements (0 or 1):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

        int result = obj.findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive ones: " + result);

        sc.close();
    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int left = 0;
        int maxcount = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                left = right + 1;
            }

            int count = right - left + 1;

            maxcount = Math.max(maxcount, count);
        }

        return maxcount;
    }
}
