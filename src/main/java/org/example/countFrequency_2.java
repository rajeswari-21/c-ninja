package org.example;

public class countFrequency_2 {
    /*
    Time Complexity: O(n)
    Space Complexity: O(n)
    where n is the size of the input array 'nums'
*/
    public static int[] countFrequency(int n, int x, int[] nums) {

        int[] arr = new int[n];

        //traver the array
        for(int num:nums) {
            // Skip the element if it is not within our range.
            if (num < n) {
                arr[num - 1]++;
            }

        }
        return arr;
    }

    public static void main(String[] a)
    {
        int[] arr= new int[]{1, 3, 1, 9, 2, 7};
        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] output= countFrequency(6,9,arr);
        for(int i:output)
            System.out.print(i+",");


    }
}