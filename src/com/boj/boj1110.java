package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1110 {

    static BufferedReader br;
    static int N, cnt=0;
    static int num,nextNum=0;
    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ADD(N);
    }

    static void ADD(int n){
        if(n==0){
            System.out.println(1);
            return;
        } else if(n==N && nextNum!=0){
            System.out.println(cnt);
            return;
        }
        num = n%10 + n/10;
        nextNum = n%10*10 + num%10;
        cnt++;
        ADD(nextNum);
    }
}
