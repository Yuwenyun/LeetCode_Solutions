package com.owen.arrays;

/**
 * problem description: https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
 */
public class LargestNumTwiceOfOthers
{
    private int largestIntIndex = 0;

    public static void main(String[] args)
    {
        int[] array1 = new int[]{3, 6, 1, 0};
        int[] array2 = new int[]{1, 2, 3, 4};

        LargestNumTwiceOfOthers obj = new LargestNumTwiceOfOthers();

        int largest1 = obj.getLargest(array1);
        System.out.println("Index: " + obj.dominantIndex(array1, largest1));

        int largest2 = obj.getLargest(array2);
        System.out.println("Index: " + obj.dominantIndex(array2, largest2));
    }

    private int getLargest(int[] array)
    {
        if(array == null || array.length == 0)
            return Integer.MAX_VALUE;

        int largest = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
                largestIntIndex = i;
            }
        }
        return largest;
    }

    private int dominantIndex(int[] array, int largest)
    {
        if(array == null || array.length == 0)
            return Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++)
        {
            if(largest < 2 * array[i] && i != this.largestIntIndex)
                return -1;
        }
        return largestIntIndex;
    }

    public int getLargestIntIndex(){ return this.largestIntIndex; }
}
