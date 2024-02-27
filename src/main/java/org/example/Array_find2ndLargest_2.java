package org.example;

// considering distinct element in array
public class Array_find2ndLargest {

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        int l=0; int r=n-1;
        mergesort(a,l,r);
        int output[]= new int[2];
        output[1]=a[l+1];
        output[0]=a[r-1];
        return output;
    }

    public static void mergesort(int[] a,int l, int r){

        if(l==r)
            return;

        int mid=(l+r)/2;
        mergesort(a,l, mid);
        mergesort(a,mid+1, r);
        merge(a,l,mid,r);

    }

    public static void merge(int a[],int l, int mid, int r)
    {
        int p1=l;
        int p2=mid+1;
        int[] temp= new int[a.length];
        int i=0;

        while(p2<=r && p1<=mid)
        {
            if(a[p1]<a[p2])
            {
                temp[i]=a[p1];
                i++;
                p1++;
            }
            else if(a[p1]>a[p2])
            {
                temp[i]=a[p2];
                i++;
                p2++;
            }

        }

        if(p1<=mid)
        {
            while(p1<=mid)
            {
                temp[i]=a[p1];
                i++;
                p1++;
            }
        }

        if(p2<=r)
        {
            while(p2<=r)
            {
                temp[i]=a[p2];
                i++;
                p2++;
            }
        }

        //replace to main array
        int k=0;
        for(int j=l;j<=r;j++)
        {
            a[j]=temp[k];
            k++;
        }
    }

    public static void main(String[] a)
    {
        //int[] arr= new int[]{2, 13, 4, 1, 3, 6, 28};
        int[] arr= new int[]{4,3,8,9,6,5};
       // int[] arr= new int[]{27,
          //      526,112,581,450,533,346,94,454,302,847,31,76,695,703,400,208,889,355,484,966,330,851,847,845,606,614,825};

        int n= arr.length;
        int output[]= getSecondOrderElements(n,arr);

        System.out.println("++++++++++++++++++++++++,");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + ",");
        }

        System.out.println( ",");
        System.out.println("++++++++++++++++++++++++, Output array:-  ");
        for(int k=0;k<output.length;k++)
        {
            System.out.print(output[k] + ",");
        }


    }
}
