package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10813 {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N+1];
        int f,l,tmp;
        for (int i = 1; i < N+1; i++) {
            basket[i] = i;
        }
        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            f = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            tmp = f;
            basket[f] = basket[l];
            basket[l] = tmp;
        }
        for (int i = 1; i < N+1; ++i) {
            System.out.print(basket[i]+" ");
        }
    }
}
