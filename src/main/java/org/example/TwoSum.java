package org.example;

import java.util.HashMap;

// for array containing 0 and positive integers
public class TwoSum {

    public static String read(int n, int []book, int target){
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-book[i])) return "YES";
            else if(!map.containsKey(book[i])) map.put(book[i], i);
        }
        return "NO";

    }

    public static void main(String... at)
    {
        int[] arr= new int[]{4, 1, 2, 3, 1};
        int k=5;
        String len= read(arr.length,arr,k);
        System.out.println(len);
    }
}
