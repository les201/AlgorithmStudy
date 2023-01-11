package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2588 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[]args)throws IOException {
        int cnt=0;
        int[] a = new int[4];
        br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String y = br.readLine();
        for (int i = y.length()-1; i >= 0; --i) {
          a[cnt] =  x * Integer.parseInt(String.valueOf(y.charAt(i)));
          cnt++;
        }
        a[3] = a[0] + a[1]*10 +a[2]*100;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
