import java.util.*;

public class Solution
{
    public static void main(String[] args) {
        Solution solution= new Solution();
        findSubarrays(new int[]{8, 2, 6, 5},50);
       // searchTriplets(new int[]{-1, 4, 2, 1, 3},5);

        //searchTriplets(new int[]{-1, 0, 2, 3},3);
   //   solution.sortedSquares(new int[]{9,4,2,10,7,8,8,1,9}));
    }

    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        int product=1;
        int st=0;

        List<List<Integer>> subarrays = new ArrayList<>();

        int count=0;
        for (int end = 0; end < arr.length; end++) {
            product*=arr[end];


                while (product>=target && st<=end)
                    product/=arr[st++];

            if(product<target) {
                List<Integer> values= new ArrayList<>();
                for(int k=end;k>=st;k--){
                    values.add(0,arr[k]);
                    subarrays.add(new ArrayList<>(values));
                }

            }

        }
        System.out.println(subarrays);
        return subarrays;
    }

    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) {
            int current= arr[i];
            int st=i+1;
            int end= arr.length-1;
            while(st<end){
                int stNum= arr[st];
                int endNum = arr[end];
                int targetSum= current+stNum+endNum;
                if(targetSum<target){
                    count+=end-st;
                    st++;
                }else {
                    end--;

                }

            }
        }
        System.out.println(count);
        return count;
    }












    /*public int maxTurbulenceSize(int[] arr) {
        int st=0;
        int windowSize= Integer.MIN_VALUE;
        boolean increasing=false;
        int end=0;
        for(int i=1;i<arr.length-1;i++){
            if(increasing || arr[i-1]<arr[i] && arr[i]>arr[i+1])
                end++;
            else if(!increasing && arr[i-1]>arr[i] && arr[i]<arr[i+1]){
                end++;
            }else if(increasing){}
        }
    }*/
}

