package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2525 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args)throws IOException {
        int h,m,time;
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        time = Integer.parseInt(br.readLine());

        m+=time;
        if (m>=60){
            h+= (m/60);
            m%=60;
        }
        if(h>23){
            h-=24;
        }
        System.out.print(h +" "+ m);
    }
}
