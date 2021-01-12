package twopointers;


public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {

    }

    public int findUnsortedSubarray(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end && nums[start] <= nums[start + 1])
            start++;

        if (start == nums.length - 1)
            return 0;

        while (end > 0 && nums[end] >= nums[end - 1])
            end--;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            max = Integer.max(nums[i], max);
            min = Integer.min(nums[i], min);
        }


        while (start > 0 && nums[start - 1] > min)
            start--;
        while (end < nums.length - 1 && nums[end + 1] < max)
            end++;

        return end - start + 1;

    }
}

