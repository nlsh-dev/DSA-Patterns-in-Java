
package Sliding_Window;

import java.util.Scanner;

public class longestOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Array size
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();  // Maximum zeros to flip

        longestOnes obj = new longestOnes();

        int result = obj.longestOnes(nums, k);

        System.out.println(result);

        sc.close();
    }

    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zero = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zero++;
            }

            while (zero > k) {

                if (nums[left] == 0) {
                    zero--;
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
