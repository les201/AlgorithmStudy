package com.boj;

import java.io.*;
import java.util.StringTokenizer;

public class boj15552 {
    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringTokenizer st;

    public static void main(String []args)throws IOException {
        int T,A,B;
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; ++i) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(A+B));
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
