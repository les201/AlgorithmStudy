package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10950 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T,x,y;
        T = Integer.parseInt(br.readLine());
        int[] answer = new int[T];
        for (int i = 0; i < T; ++i) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            answer[i] = x + y;
            System.out.println(answer[i]);
        }
    }
}
