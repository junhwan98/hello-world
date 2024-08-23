package javaEx01;

import java.util.Arrays;

public class KthSmallest {

    public static int findKthSmallest(int[]arr, int k){
        //배열 정렬
        Arrays.sort(arr);

        // k번째 최소값 반환
        return arr[k-1];
    }
    public static void main(String[] args) {

    int[] arr = {3,5,2,6,4};
    int k = 3;

    //배열 정렬
    Arrays.sort(arr);
    // k번째 최소값

        System.out.println(k +"번째 최소값 : " + findKthSmallest(arr,k));
    }
}
