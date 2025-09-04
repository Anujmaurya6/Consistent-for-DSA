package ARRAY.QUEUE.Revision;

import java.util.*;

public class BASPRactice {
   // sorted array ke liye karunga
    public static List<Integer> intersectionArray(int []arr1,int[]arr2){

        List<Integer> result=new ArrayList<>();
        int i=0;
        int j=0;
        Integer lastadded=null;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[i]){
                if(lastadded == null || lastadded != arr1[i]){
                    result.add(arr1[i]);
                    lastadded=arr1[i];
                }
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return result;
        
    }
 public static void main(String[] args){
    int[] arr1={1,2,3,4,5};
    int[] arr2={3,4,5};
 }
    
}

