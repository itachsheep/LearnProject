package structe_data.sixth_recursion;

import java.util.ArrayList;
import java.util.List;

import structe_data.Utils;

/**
 * Created by taowei on 2017/7/20.
 * 2017-07-20 23:08
 * Algorithm
 * structe_data
 */

public class Recursion_7_knapsack {
    private static int[] subArr ;
    public static void main(String[] args){
//        int[] arr = {11,8,7,6,5};
        int[] arr = {-1, 0, 1, 2, -1, -4};
        subArr = new int[arr.length];
        int total = 0;
        knapsack(arr,total);
    }
    private static void knapsack(int[] arr,int target){
        int length = arr.length;
//        for(int i = 0; i < length; i++){
//            //组合数字的个数，1,2...递增
//            int mElements = i+1;
//            combine_find(arr,length,mElements,0,target);
//        }
        combine_find(arr,length,3,0,0);
    }

    /**
     *
     * @param arr
     * 原始数组
     * @param length
     *  从后往前开始找，选定了 n-1,剩下的 mElements-1个就从 1，2，..n-2中开始找，
     *  选定了 n-2,剩下的 mElements-1个就从 1，2，..n-3中开始找
     *  依次类推，length在不断的减少
     * @param mElements
     * 组合数组的大小
     * @param nReady
     * 已经放到组合数组里面的元素个数
     */
    private static void combine_find(int[] arr, int length, int mElements,int nReady,int target) {
        if(nReady == mElements){
            //放到组合数组的个数等于组合数组的大小 ，找齐了，就不找了
            int sum = 0;
            for (int i : subArr) {
                sum += i;
            }
            if(sum == target){
                Utils.printArr(subArr,mElements);
            }
        }else {
            //从后往前开始找，停止条件是 i 大于还需要找的数组个数
            for(int i = length; i >= mElements-nReady; i--){
                subArr[nReady] = arr[i -1];
                combine_find(arr,i-1,mElements,nReady+1,target);
            }
        }
    }
}
