package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj25304 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args)throws IOException {
        int X,N,a,b;
        int total=0;
        br = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            total += a * b;
        }
        if(total ==X){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
