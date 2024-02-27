package org.example;

public class SolutionMerge {

    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here

        divideMerge(arr, l, r);

    }

    public static void divideMerge(int[] arr,int l,int r)
    {

        if(l==r) {
            System.out.println("+++++++++ return,"+l);
            return;
        }
        int mid= (l+r)/2;
        System.out.println("+++++++++ mid,"+mid);
        System.out.println("+++++++++ left,");
        //left half of array
        divideMerge(arr, l, mid);

        System.out.println("+++++++++ right,");
        //right half of array
        divideMerge(arr, mid+1, r);

        System.out.println("+++++++++ merge,");
        merge(arr, l, r, mid);




        System.out.println("After merge+++++++++++++++++++,");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + ",");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int l, int r, int mid)
    {
        System.out.println("+++++++++ inside merge,"+l +","+r+","+mid);
        int[] temp= new int[arr.length];
        int i=0;
        int p1=l;
        int p2=mid+1;
        while(p2<=r && p1<=mid)
        {
            System.out.println("+++++++++ while,"+p1+","+p2);

            if(arr[p1]>arr[p2])
            {
                //swap(arr,l1,l2);
                temp[i]= arr[p2];
                p2++; i++;
            }
            else if (arr[p1]<arr[p2]) {
                temp[i]= arr[p1];
                p1++; i++;
            }
            else if (arr[p1]==arr[p2]) {
                temp[i]= arr[p1];
                p1++; i++;
            }


        }

        while(p2<=r)
        {
            temp[i]=arr[p2];
            i++;
            p2++;
        }
        while(p1<=mid)
        {
            temp[i]= arr[p1];
            p1++; i++;
        }

        // insert into arr
        for(int k=0;k<temp.length;k++)
        {
            if(l<=r){
                arr[l]=temp[k];
                l++;
            }

        }
       // return temp;


    }
    public static void swap(int[] arr,int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] a)
    {
        int[] arr= new int[]{2, 13, 4, 1, 3, 6, 28};
        //int[] arr= new int[]{9,3,6,2,0};
        int l=0;
        int r=arr.length-1;
        mergeSort(arr,l,r);

        System.out.println("++++++++++++++++++++++++,");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + ",");
        }


    }

}
