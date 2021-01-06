package slidingwindows;

import java.util.ArrayDeque;
import java.util.Deque;
//https://leetcode.com/problems/sliding-window-maximum/
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> q= new ArrayDeque<>();
        int st=0;
        int result[]= new int[n-k+1];
        for(int i=0;i<n;i++){

            while (q.size() > 0 && q.peekFirst() <= i-k)
                q.pollFirst();
            // remove elemnts that are currentlu less than nums[i]
            while (q.size() > 0 && nums[q.peekLast()] < nums[i])
                q.pollLast();

            q.offerLast(i);
            // System.out.println( "["+q+"]") ;
            if(i+1>=k){
                //System.out.println(i-k+1) ;
                result[i-k+1]= nums[q.peekFirst()];
            }



        }
        return result;

    }
}
