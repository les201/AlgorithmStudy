package com.boj;

import java.util.Arrays;
import java.util.Scanner;

public class boj2309 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[]arr = new int[9];
        int n = arr.length;
        for(int i=0;i<n;++i) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0;i <(1<<n); ++i){
            int sum = 0;
            if(Integer.bitCount(i)==7){
                for(int j =0;j <n;++j){
                    if((i & (1<<j))!=0){
                        sum+=arr[j];
                    }
                }
                if(sum==100){
                    for (int j = 0;j < n; ++j){
                        if((i&(1<<j))!=0){
                            System.out.println(arr[j]);
                        }
                    }
                    break; //i가 계속 돌아가니까, 다른조합이 있으면 전부 다 출력하게 됨. break를 넣어야 무작위 1가지 경우만 출력하고 끝
                }
            }
        }
    }
}
