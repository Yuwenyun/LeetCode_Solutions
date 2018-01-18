package com.owen.arrays;

/**
 * problem description: https://leetcode.com/problems/min-cost-climbing-stairs/description/
 */
public class MinCostClimbingStairs
{
    public static void main(String[] args)
    {
        int[] array1 = new int[]{10, 15, 20};
        int[] array2 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] array3 = new int[]{4, 5, 6, 3};

        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int minCost = minCostClimbingStairs.getMinCost(array1);
        System.out.println(minCost);
        minCost = minCostClimbingStairs.getMinCost1(array2);
        System.out.println(minCost);
        minCost = minCostClimbingStairs.getMinCost(array3);
        System.out.println(minCost);
    }

    private int getMinCost(int[] cost)
    {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i)
        {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }

    private int getMinCost1(int[] cost)
    {
        for(int i=2;i<=cost.length-1;i++)
        {
            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
        }

        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}
