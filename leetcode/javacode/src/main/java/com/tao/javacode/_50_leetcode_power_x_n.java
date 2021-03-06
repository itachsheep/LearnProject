package com.tao.javacode;

/**
 *
 * Implement pow(x, n), which calculates x raised to the power n (xn).

 Example 1:

 Input: 2.00000, 10
 Output: 1024.00000
 Example 2:

 Input: 2.10000, 3
 Output: 9.26100
 Example 3:

 Input: 2.00000, -2
 Output: 0.25000
 Explanation: 2-2 = 1/22 = 1/4 = 0.25
 Note:

         -100.0 < x < 100.0
         n is a 32-bit signed integer, within the range [−2^31, 2^31 − 1]
 * Created by SDT14324 on 2018/5/14.
 */

public class _50_leetcode_power_x_n {
    public static void main(String[] arg){
        System.out.println(myPow(2.000,10));
        System.out.println(myPow(2.100,3));
        System.out.println(myPow(2.000,-2));
    }

    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n < 0){
            n = -n;
            x = 1/x;
        }
        return (n % 2 == 0 ? myPow(x * x, n/2) : x * myPow(x * x, n/2));
    }
}
