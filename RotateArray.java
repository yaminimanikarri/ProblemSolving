package problemSolvingEasy;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotate(int[] nums, int k) {

        int n = nums.length;
        // Adjust k to ensure it's within the bounds of the array length
        k = k % n;
        if (k < 0) {
            k += n;
        }
        reverse(nums, 0, n - 1); // reverse all  7 654321
        reverse(nums, 0, k - 1); // rotate array by k elements
        reverse(nums, k, n - 1); //
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 3;
        int[] output = rotate(nums, k);
        for (int i = 0; i < output.length; i++) {

            System.out.print(output[i] + " ");
        }
    }
}
