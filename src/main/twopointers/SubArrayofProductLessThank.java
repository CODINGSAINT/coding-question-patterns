package twopointers;

public class SubArrayofProductLessThank {


    public static void main(String[] args) {
        SubArrayofProductLessThank s = new SubArrayofProductLessThank();
        System.out.println(s.numSubarrayProductLessThanK(new int[]{8, 2, 6, 5}, 50));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int st = 0;
        int product = 1;
        for (int end = 0; end < nums.length; end++) {


            product *= nums[end];

            while (product >= k && st <=end) {
                product /= nums[st++];
            }
            if (product < k)
                count+=end-st+1;


        }
        return count;
    }
}
