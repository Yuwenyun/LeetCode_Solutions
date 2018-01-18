package com.owen.arrays;

/**
 * Problem description: https://leetcode.com/problems/find-pivot-index/description/
 */
public class FindPivotIndex
{
    public static void main(String[] args)
    {
        int[] array1 = new int[]{1, 7, 3, 6, 5, 6};
        int[] array2 = new int[]{1, 2, 3};

        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.getPivotIndex(findPivotIndex.getSum(array1.length, array1), array1));
        System.out.println(findPivotIndex.getPivotIndex(findPivotIndex.getSum(array2.length, array2), array2));
    }

    private int getPivotIndex(int sum, int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            int leftSum = getSum(i, array);
            int rightSum = sum - array[i] - leftSum;
            if(leftSum == rightSum)
                return i;
        }
        return -1;
    }

    private int getSum(int index, int[] array)
    {
        if(index > array.length)
            index = array.length;

        int sum = 0;
        for(int i = 0; i < index; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}
