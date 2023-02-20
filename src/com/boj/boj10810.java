package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10810 {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args)throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        int f,l,ballNum;
        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            f = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            ballNum = Integer.parseInt(st.nextToken());
            for (int j = f; j < l+1; ++j) {
                arr[j]=ballNum;
            }
        }
        for (int i = 1; i < arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }
    }

}
