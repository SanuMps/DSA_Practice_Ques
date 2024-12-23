package org.practice.array;

//Richest Customer Wealth
//You are given an m x n integer grid accounts where accounts [i][j] is the amount of money the ith
// customer has in the jth bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the
// customer that has the maximum wealth.
//Constraints:
//• m == accounts.length
//. n == accounts[i].length
//• 1 <= m, n <= 50
//• 1 <= accounts[i][j] <= 100


class SumValues2DArray {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }

    public static void main(String[] args) {
        SumValues2DArray obj = new SumValues2DArray();
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };

        int result = obj.maximumWealth(accounts);
        System.out.println("The maximum wealth is: " + result);
    }
}
