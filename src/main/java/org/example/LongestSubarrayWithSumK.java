package org.example;

// for array containing 0 and positive integers
public class LongestSubarrayWithSumK {

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here

        int p1; int p2=0; long sum=0; int len=0; int size= a.length;
        for(p1=0;p1<size;p1++)
        {

            sum+=a[p1];
            while(sum>k && p1>=p2)
            {
                sum-=a[p2];
                p2++;
            }

            if(sum==k)
            {
                len= Math.max(len, (p1-p2)+1);
            }

        }

        return len;
    }

    public static void main(String... at)
    {
        int[] arr= new int[]{1,2,2,1,1,1,1,3,3};
        long k=6;
        int len= longestSubarrayWithSumK(arr,k);
        System.out.println(len);
    }
}
