package com.boj;

import java.io.*;
import java.util.StringTokenizer;

public class boj10952 {
    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int A,B,ck=1;
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(ck!=0){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(A==0 && B==0){
                ck=0;
            }else{
                bw.write(""+(A+B));
                bw.write("\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
