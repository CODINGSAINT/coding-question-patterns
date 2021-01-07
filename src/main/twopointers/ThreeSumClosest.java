package twopointers;

import java.util.*;
//https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {
    public int threeSumClosest(int[] arr, int target) {

        Arrays.sort(arr);
        int closest = Integer.MAX_VALUE;
        boolean closestFound = false;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int st = i + 1;
            int end = arr.length - 1;
            while (st < end) {
                int targetDiff = target - arr[i] - arr[st] - arr[end];
                if (targetDiff == 0)
                    return target - targetDiff;


                if (Math.abs(targetDiff) < Math.abs(closest)
                        || (Math.abs(targetDiff) == Math.abs(closest)
                        && targetDiff > closest)) {
                    closest = targetDiff;
                }

                if (targetDiff > 0) {
                    st++;
                } else {
                    end--;
                }
            }
        }

        return target - closest;

    }
}
