package twoheaps;
import java.util.*;
//295. Find Median from Data Stream
public class FindMedianfromDataStream {
}
    class MedianFinder {
    /** initialize your data structure here. */
    PriorityQueue<Integer> max=null;// new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer> min= null;//new PriorityQueue<>((a,b)->a-b);


    public MedianFinder() {
        max= new PriorityQueue<>((a,b)->b-a);
        min= new PriorityQueue<>((a,b)->a-b);

    }

    public void addNum(int num) {

        if(max.size()==0||max.peek()>=num){
            max.offer(num);
            //  return;
        }else{
            min.offer(num);
        }
        if(max.size()>min.size()+1){
            min.offer(max.poll());
        }
        else  if(min.size()>max.size()){
            max.offer(min.poll());
        }


    }

    public double findMedian() {
        //    System.out.println(max.peek() +" "+min.peek());
        //System.out.println(max +" "+min);
        return max.size() > min.size() ? max.peek():( max.peek() + min.peek())/2.0;

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */