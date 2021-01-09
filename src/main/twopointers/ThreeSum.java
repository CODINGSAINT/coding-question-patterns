package twopointers;
import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {

    }


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> triplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // need to find numbers that are sum of -current

            int st = i + 1;
            int end = nums.length - 1;
            while (st < end) {
                int sum = nums[st] + nums[end] + current;
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[st]);
                    triplet.add(nums[end]);
                    triplet.add(current);
                    triplets.add(triplet);

                    st++;
                    end--;
                } else if (sum < 0) {
                    st++;
                } else {
                    end--;
                }
            }

        }
        List<List<Integer>> result = new ArrayList<>(triplets);
        return result;
    }
}
