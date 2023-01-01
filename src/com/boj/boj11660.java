package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11660 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[]args) throws IOException{
        int N,M, x1,x2,y1,y2, answer; //N- 크기, M- 횟수

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int [][] graph = new int [N+1][N+1];
        int [][] sum = new int [N+1][N+1];

        for (int i = 1; i <= N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; ++j) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = sum[i-1][j] + sum[i][j-1] + graph[i][j] - sum[i-1][j-1];
            }
        }

        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            answer = sum[x2][y2] - sum[x1 -1][y2] - sum[x2][y1 -1] + sum[x1 -1][y1 -1];
            System.out.println(answer);

        }

    }

}