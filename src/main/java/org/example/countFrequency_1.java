package org.example;

public class countFrequency_1 {
    /*
    Time Complexity: O(n)
    Space Complexity: O(1)
    where n is the size of the input array 'nums'
*/
        public static int[] countFrequency(int n, int x, int []nums){
            // Iterate through the array and modify the elements to track the frequency.
            int i = 0;
            while (i < n)
            {
                // Skip the element if it is not within our range.
                if (nums[i] > n || nums[i] < 1)
                {
                    i++;
                    continue;
                }

                // Calculate the index of the element.
                int j = nums[i] - 1;

                // Update the frequencies.
                if (nums[j] < 0)
                {
                    nums[i] = 0;
                    nums[j]--;
                    i++;
                    continue;
                }
                else
                {
                    swap(nums, j, i);
                    nums[j] = -1;
                }
            }

            // Adjust the negative values to positive frequencies.
            for (int k = 0; k < nums.length; k++)
            {
                if (nums[k] < 0)
                    nums[k] *= -1;
                else
                    nums[k] = 0;
            }

            // Return the array with frequencies.
            return nums;
        }
        public static void swap(int []a, int i, int j) {
            int temp =a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

