package twopointers;

public class SortColor {
    public static void main(String[] args) {
        SortColor sortColor= new SortColor();
        int res[]=new int[]{2,0,2,1,1,0};
        sortColor.sortColors(res);
        for(int i :res){
            System.out.print(i+" ");
        }
    }
    public void sortColors(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        int i=1;
        while (st< end) {
            int current = nums[i];
            if (current == 0 && nums[st] != 0) {
                swap(nums, i, st);
                st++;
            } else if (current == 2 && nums[end] != 2) {
                swap(nums, i, end);
                end--;
            }else
                i++;
        }

    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}