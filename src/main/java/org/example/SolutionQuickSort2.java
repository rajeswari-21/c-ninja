package org.example;

public class SolutionQuickSort2 {



        public static void quickSort(int[] input,int startIndex, int endIndex) {



            if(startIndex>=endIndex){

                return;

            }



            int pidx = partition(input,startIndex,endIndex);

            quickSort(input,startIndex,pidx-1);

            quickSort(input,pidx+1,endIndex);

        }



        public static int partition(int input[],int si,int ei){

            int pivot = input[ei];
            System.out.println("in partition," + " start " + si + " end " + ei);
            System.out.println("in partition," + " pivot " + pivot);
            int i = si-1;
            System.out.println("in partition," + " i " + i);

            for(int j = si;j<ei;j++){

                if(input[j]<pivot){

                    i++;
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;


                    System.out.println("in partition ," + " temp " + temp);
                    System.out.println("in partition ," + " input[i] " + input[i]);
                    System.out.println("in partition ," + " input[j] " + input[j]);

                    System.out.println("+++++++++++++++++,in for loop array: ");
                    for(int k=0;k<input.length;k++)
                    {
                        System.out.print(input[k] + ",");
                    }

                }

            }


            i++;

            int temp = pivot;

            input[ei] = input[i];

            input[i] = temp;

            System.out.println("+++++++++++++++++,after for loop array: ");
            for(int k=0;k<input.length;k++)
            {
                System.out.print(input[k] + ",");
            }

            return i;

        }





    public static void main(String[] a)
    {
        //int[] arr= new int[]{2, 13, 4, 1, 3, 6, 28};
        int[] arr= new int[]{4,3,8,4,6,5};
        //int[] arr= new int[]
              //  {27, 526,112,581,450,533,346,94,454,302,847,31,76,695,703,400,208,889,355,484,966,330,851,847,845,606,614,825};

        int l=0;
        int r=arr.length-1;
        quickSort(arr,l,r);

        System.out.println("++++++++++++++++++++++++,");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + ",");
        }


    }

}
