package com.boj;
import java.io.*;

public class boj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum=0;
        int[] num = new int[N];
        String str = br.readLine();
        for(int i=0;i<N;++i){
            num[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
