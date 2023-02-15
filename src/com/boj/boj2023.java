package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2023 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static int N;
    public static void main(String[] args)throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        DFS("",0);
        System.out.println(sb);
    }//main

    static void DFS(String v, int depth) {
        if(depth==N){
            sb.append(v+"\n");
            return;
        }
        for (int i = 1; i < 10; ++i) {
            if(chkSosu(Integer.parseInt(v+i))){
                DFS(v+i,depth + 1);
            }
        }
    } //DFS
    static boolean chkSosu(int n){ //소수 판별
        if(n==1){
            return false;
        }
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; ++i) {
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

} //boj
