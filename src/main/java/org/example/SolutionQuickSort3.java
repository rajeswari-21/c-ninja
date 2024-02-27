package org.example;

public class SolutionQuickSort3 {

    public static void solution(int[] arr, int start, int end){
        // Write your code here

        quickSort(arr, start, end);

    }

    public static void quickSort(int[] arr,int start,int end)
    {
        if(start==end || arr[start]==arr[end]){
            System.out.println("returned*******************");
            return;
        }

        //{4,3,8,4,6,5}
        //consider pivot the start element
        int pivot;

        //System.out.println("before find position array pivot,"+pivot+" pivotelement "+ arr[pivot]);
        pivot= findPosition(arr,start,end);
        System.out.println("after find position array pivot,"+pivot+" pivotelement "+ arr[pivot]);
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + ",");
        }
        System.out.println(" ");

        //left of pivot
            System.out.println("left pivot," + " start " + arr[start] + " end " + arr[pivot]);
            quickSort(arr, start, pivot);


        //right of pivot
        if(pivot!=end) {
            System.out.println("right pivot," + " start " + arr[pivot + 1] + " end " + arr[end]);
            quickSort(arr, pivot + 1, arr.length-1);
        }

    }

    public static int findPosition(int arr[],int start, int end)
    {

        int pivot=start;
        System.out.println("******in find position,"+pivot+" pivotelement "+ arr[pivot]+
                " start "+ arr[start] +" end "+ arr[end]);

        for(int i=start+1; i<=end;i++)
        {
            if(arr[pivot]> arr[i] || arr[pivot]==arr[i])
            {
                swap(arr,pivot,i);
                pivot+=1;
            }
        }
        return pivot;

    }


    public static void swap(int[] arr,int pivot, int smaller){
        int i=smaller;
        while(i!=pivot)
        {
            int temp=arr[i];
            arr[i]= arr[i-1];
            arr[i-1]=temp;
            i--;
        }

    }

    public static void main(String[] a)
    {
        //int[] arr= new int[]{2, 13, 4, 1, 3, 6, 28};
        //int[] arr= new int[]{4,3,8,4,6,5};
        int[] arr= new int[]{27,
        526,112,581,450,533,346,94,454,302,847,31,76,695,703,400,208,889,355,484,966,330,851,847,845,606,614,825};

        int l=0;
        int r=arr.length-1;
        solution(arr,l,r);

        System.out.println("++++++++++++++++++++++++,");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + ",");
        }


    }

}
