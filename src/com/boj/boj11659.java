package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11659 {
    public static void main(String [] args) throws IOException {
        int N,M, x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //1. N M
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int [] num = new int[N];
        int [] sum = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < num.length+1; ++i) { // 배열에 저장
            num [i-1] = Integer.parseInt(st.nextToken());
            if(i==1){
                sum[i-1]= num[i-1];
            } else if (i!=1) {
                sum[i-1] = num[i-1]+sum[i-2];
            }
        }

        for (int i = 0; i < M; i++) { //test
           st = new StringTokenizer(br.readLine());
           x = Integer.parseInt(st.nextToken());
           y = Integer.parseInt(st.nextToken());
           if(x<2){
               System.out.println(sum[y-1]);
           }else{
               System.out.println(sum[y-1]-sum[x-2]);
           }

        }
    }
}
