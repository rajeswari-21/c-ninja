package org.example;

import java.util.ArrayList;
import java.util.Arrays;


public class ReverseArray {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.

        int n=arr.size();
        ArrayList<Integer> temp= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int p=i-k;
            if(p<0)
            {
                temp.add(i,arr.get(i));
            }
            else
                arr.set(p,arr.get(i));

        }

        for(int j=0;j<temp.size();j++)
        {
            int p=(j-k) + n;
            arr.set(p,temp.get(j));

        }

        return arr;
    }

    public static void main(String[] a)
    {

        int[] arr2= new int[]{2, 13, 4, 1, 3, 6, 28};
        //int[] arr3= new int[]{1,2};

        //int[] arr1= new int[]{27,
        //526,112,581,450,533,346,94,454,302,847,31,76,695,703,400,208,889,355,484,966,330,851,847,845,606,614,825};

        ArrayList<Integer> arr= new ArrayList<>();
        for (int i:
             arr2) {
            arr.add(i);

        }


        int k=3;
        rotateArray(arr,k);

        System.out.println("++++++++++++++++++++++++,");
        for(int k1=0;k1<arr.size();k1++)
        {
            System.out.print(arr.get(k1) + ",");
        }


    }

}
