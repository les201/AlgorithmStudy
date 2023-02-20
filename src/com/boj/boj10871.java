package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10871 {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            A[i]= Integer.parseInt(st.nextToken());
            if (A[i]<X){
                System.out.print(A[i]+" ");
            }
        }
    }
}
