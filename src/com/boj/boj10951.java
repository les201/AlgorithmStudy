package com.boj;

import java.io.*;
import java.util.StringTokenizer;

public class boj10951 {
    public static BufferedReader br;
    public static StringTokenizer st;
    public static BufferedWriter bw;
    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str="";
        while ((str =br.readLine())!=null){
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(""+(A+B)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
