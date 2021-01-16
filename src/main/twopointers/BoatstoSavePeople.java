package twopointers;

import java.util.Arrays;
import java.util.Collections;

public class BoatstoSavePeople {
    public static void main(String[] args) {
        BoatstoSavePeople b= new BoatstoSavePeople();
         System.out.println(b.numRescueBoats(new int[]{1,2},3));
        System.out.println(b.numRescueBoats(new int[]{3,2,2,1},3));
        System.out.println(b.numRescueBoats(new int[]{3,5,3,4},5));


    }
    public int numRescueBoats(int[] people, int limit) {
        int end=people.length-1;
        int sum=0;
        int trip =0;
        int st=0;
        Arrays.sort(people);
        while (st<=end){
            trip++;
            if (people[st]+people[end]<=limit)
                st++;
            end--;
        }


        return  trip;
    }
}