package twopointers;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray sortedArray = new RemoveDuplicatesfromSortedArray();
        sortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

// Keep i 0 ; j=1


    public int removeDuplicates(int[] nums) {

        int j=1;
        for (int i = 1; i < nums.length; i++) {
                if(nums[j-1]!=nums[i]){
                   // System.out.println("i="+i+", j="+j +" nums[i] ="+nums[i]+" nums[i] = "+nums[j]);
                    nums[j]=nums[i];
                    j++;
                }


        }
        //System.out.println(j);

    return j;
    }

    private void swap(int[] nums,int i, int j) {
    int temp= nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
    }
}

