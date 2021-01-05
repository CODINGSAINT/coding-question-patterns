package slidingwindows;
//https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

    }

    public  int minSubArrayLen(int s, int[] nums) {
        int min= Integer.MAX_VALUE;
        int st=0;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            while(currentSum>=s){
                min=Integer.min(i+1-st , min);
                currentSum-=nums[st];
                st++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;


    }
}
