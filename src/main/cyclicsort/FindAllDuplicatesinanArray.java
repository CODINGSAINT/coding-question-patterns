package cyclicsort;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.*;

public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> vals= new ArrayList<>();
        int i=0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }
        for(i=0;i<nums.length;i++){
            // System.out.print(nums[i]+" ,");
            if(nums[i]!=i+1){

                vals.add(nums[i]);
            }

        }
        return vals;


    }

    void swap(int nums[],int i,int j){
        int k= nums[i];
        nums[i]=nums[j];
        nums[j]=k;

    }
}
