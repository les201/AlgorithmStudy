package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5597 {
    static BufferedReader br;
    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        int n=0;
        int[] x = new int[2];
        for (int i = 0; i < 28; ++i) {
            n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }
        int N=0;
        for (int i = 1; i < 31; ++i) {
            if (arr[i]==false){
                x[N]= i;
                N++;
            }
        }
        if (x[0]>x[1]){
            System.out.println(x[1]);
            System.out.println(x[0]);
        } else {
            System.out.println(x[0]);
            System.out.println(x[1]);
        }
    }
}
