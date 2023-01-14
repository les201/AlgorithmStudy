package com.boj;

import java.io.*;
import java.util.StringTokenizer;

public class boj2438 {
    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void main(String[] args)throws IOException {
        int N;
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < i+1; ++j) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
