package org.example;

// considering distinct element in array
public class Array_find2ndLargest_2 {

    public static int[] getSecondOrderElements(int n, int []a) {



// Initializing min and max to MAX and MIN values respectively for comaparison purpose

        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;

        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;

        //min1,min2 = first,second minimum elements

        //max1,max2 = first.second maximum elements



//Try to dry run for array {2,1,3,4} VERY IMPORTANT

//Traversing the array and updating max and min values

        for(int i=0;i<n;i++){



            //a[i] > first max

            if(a[i]>max1){

                int temp=max1;

                max1=a[i];

                max2=temp;

            }

            //a[i] > second max

            else if(a[i]>max2){

                max2=a[i];

            }

            //a[i] < first min

            if(a[i]<min1){

                int temp=min1;

                min1=a[i];

                min2=temp;

            }

            //a[i] <second min

            else if(a[i]<min2){

                min2=a[i];

            }

        }



// Returning second maximum, second minimum element

        return new int[] {max2,min2};





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
