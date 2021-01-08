/*
public class Solution
{
    public static void main(String[] args) {
        Solution solution= new Solution();
      solution.sortedSquares(new int[]{9,4,2,10,7,8,8,1,9}));
    }

    public int maxTurbulenceSize(int[] arr) {
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
    }
}
*/
