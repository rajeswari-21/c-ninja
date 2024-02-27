package org.example;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetFrequency {
        public static int[] getFrequencies(int []v) {
            // Write Your Code Here

            HashMap map= new HashMap<Integer,Integer>();
            int[] output= new int[2];

            for(int vno:v)
            {
                int i=0;
                if(map.get(vno)!=null)
                     i= (int) map.get(vno);

                map.put(vno, i+1);
            }

            System.out.println(map.toString());
            Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
            int maxF=0; int minF=v[v.length-1]; int maxE=0; int minE=0;
            while(it.hasNext())
            {
                Map.Entry<Integer, Integer> entry = it.next();
                if(entry.getValue()>maxF)
                {
                    maxE= entry.getKey();
                    maxF= entry.getValue();

                }
                else if(entry.getValue()==maxF)
                {
                    maxE = Math.min(entry.getKey(),maxE);
                }
                if(entry.getValue()<minF)
                {
                    minE= entry.getKey();
                    minF= entry.getValue();

                }
                else if(entry.getValue()==minF)
                {
                    minE = Math.min(entry.getKey(),minE);
                }

            }
            output[0]=maxE;
            output[1]=minE;
            return output;




        }

    public static void main(String[] a)
    {
        //int[] arr= new int[]{1, 2, 3, 1, 1, 4};
        int[] arr= new int[]{10, 10, 10, 3, 3, 3};
        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        /*int[] output= getFrequencies(arr);
        for(int i:output)
            System.out.print(i+",");*/

        int[] r= getFrequencies(arr);
        for(int i:r)
            System.out.print(i+",");



    }

}
