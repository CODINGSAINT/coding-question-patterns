package twoheaps;
//480. Sliding Window Median
//https://leetcode.com/problems/sliding-window-median/
import java.util.*;
public class SlidingWindowMedian {
    PriorityQueue<Integer> max= null;
    PriorityQueue<Integer>min= null;

    public double[] medianSlidingWindow(int[] nums, int k) {

        max= new PriorityQueue<>(Collections.reverseOrder());
        min= new PriorityQueue<>();
        int n= nums.length;

        int st=0;
        double result[]=new double[nums.length-k+1];
        for(int i=0;i<n;i++){
            int current=nums[i];
            if(max.isEmpty()||max.peek()>=nums[i] ){
                max.offer(nums[i]);
            }else{
                min.offer(nums[i] );

            }
            rebalance();
            if(i>=k-1){
                if(max.size()==min.size()){
                    result[i+1-k]=  max.peek()/2.0+min.peek()/2.0;
                }else{
                    result[i+1-k]= (double)max.peek();
                }

                int start= nums[st++];
                if(start<=max.peek()){
                    max.remove(start);
                }else{
                    min.remove(start);
                }
                rebalance();
            }



        }
        return result;

    }

    void rebalance(){
        if(max.size()>min.size()+1){
            min.add(max.poll());
        }else if(min.size()>max.size()){
            max.add(min.poll());
        }
    }
}