package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3003 {

    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] input = new int[6];
        int[] arr = {1,1,2,2,2,8};
        int[] result = new int[6];

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < input.length; ++i) {
            input[i] = Integer.parseInt(st.nextToken());
            result[i] = arr[i]-input[i];
        }
        for (int i = 0; i < input.length; ++i) {
            System.out.print(result[i]+" ");
        }
    }


}
