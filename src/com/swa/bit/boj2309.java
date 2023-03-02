package com.swa.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj2309 {
    static BufferedReader br;
    public static void main(String[] args)throws IOException{
        br = new BufferedReader (new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < 9; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < (1<<9); ++i) { //i=bitMask
            int sum=0;
            if(Integer.bitCount(i)==7){
                for (int j = 0; j < 9; ++j) {
                    if((i&(1<<j))!=0) sum+=arr[j];
                }
                if (sum==100){
                    for (int j = 0; j < 9; ++j) {
                        if((i&(1<<j))!=0) System.out.println(arr[j]);
                    }
                   // break;
                }
            }

        }
    }
}
