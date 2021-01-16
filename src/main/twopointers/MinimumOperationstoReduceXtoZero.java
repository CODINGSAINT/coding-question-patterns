package twopointers;

import java.util.Arrays;
import java.util.Collections;

public class MinimumOperationstoReduceXtoZero {
    public static void main(String[] args) {
        MinimumOperationstoReduceXtoZero min= new MinimumOperationstoReduceXtoZero();
       /* System.out.println(min.minOperations(new int[]{1,1,4,2,3}, 5) );
        System.out.println(min.minOperations(new int[]{5,6,7,8,9}, 4));
        System.out.println(min.minOperations(new int[]{3,2,20,1,1,3}, 10));
       */
        System.out.println(min.minOperations(new int[]{1,1,3,2,5}, 5));


    }
    public int minOperations(int[] nums, int x) {
        int sum=Arrays.stream(nums).sum();
        int target=sum-x;
        if (target == 0)
            return nums.length;
        if(target < 0)
            return -1;
        int start=0;
        int windowSum=0;
        int min = 0;
        for (int end = 0; end < nums.length; end++) {
            windowSum+= nums[end];
            while (windowSum>target)
                windowSum-=nums[start++];
            if (windowSum==target)
                min=Integer.max(min, end-start+1);

        }
        return min==Integer.MAX_VALUE ?-1: nums.length-min;
    }
}
