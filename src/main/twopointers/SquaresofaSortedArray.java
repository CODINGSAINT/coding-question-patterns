package twopointers;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        SquaresofaSortedArray sq= new SquaresofaSortedArray();
        int result[]= sq.sortedSquares(new int []{-4,-1,0,3,10});
        for(int i: result){
            System.out.print(i+" , ");
        }

    }
    public int[] sortedSquares(int[] nums) {
            int end = nums.length-1;
            int st=0;
            int last= end;
            int squares[]= new int[nums.length];
            while(st<end){
                int leftSquare= nums[st]*nums[st];
                int rightSquare= nums[end]*nums[end];
                if(leftSquare>rightSquare){
                    squares[last--]= leftSquare;
                    st++;
                }else{
                    squares[last--]=rightSquare;
                    end--;
                }

            }
        return squares;
    }
}
