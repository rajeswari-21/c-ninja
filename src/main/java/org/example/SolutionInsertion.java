package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SolutionInsertion {

        public static void insertionSort(int[] arr, int size) {
            //Your code goes here

            //sub array
            for(int i=1;i<size;i++)
            {
                //within that sub array sort
                int j=i;
                while(j>0 && arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1);
                    j--;
                }

                for(int k=0;k<=i;k++)
                {
                    System.out.print(arr[k] + ",");
                }
                System.out.println("");
            }
        }


        public static void swap(int[] arr,int i,int j)
        {
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }

    public static void main(String[] a)
    {
        //int[] arr= new int[]{2, 13, 4, 1, 3, 6, 28};
        int[] arr= new int[]{9,3,6,2,0};
        insertionSort(arr, arr.length);

        System.out.println("++++++++++++++++++++++++,");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + ",");
        }


    }

}
