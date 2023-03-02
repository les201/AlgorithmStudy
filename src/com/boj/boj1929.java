package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj1929 {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        ArrayList<Boolean> primeList;
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m<=1) return;
        primeList = new ArrayList<Boolean>(m+1);
        primeList.add(false);
        primeList.add(false);

        for (int i = 2; i <=m; ++i) {
                primeList.add(i,true);
        }
        for (int i = 2; (i*i) <=m; ++i) {
            if (primeList.get(i)){
                for (int j = i*2; j <=m; j+=i) {
                    primeList.set(j,false);
                }
            }
        }
        for (int i = n; i <=m; ++i) {
            if (primeList.get(i)==true){
                System.out.println(i);
            }
        }
    }
}
