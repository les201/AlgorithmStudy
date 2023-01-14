package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10986 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N, M, cnt;
        cnt = 0;
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] sum = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i == 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = arr[i] + sum[i - 1];
            }
            if (sum[i] % M == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
