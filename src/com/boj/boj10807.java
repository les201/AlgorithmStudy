package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10807 {
    static BufferedReader br;
    static StringTokenizer st;
    static int cnt=0;
    public static void main(String[] args)throws IOException {
        br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; ++i) {
            if (arr[i]==v) cnt++;
        }
        System.out.println(cnt);

    }
}
