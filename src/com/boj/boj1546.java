package com.boj;

import java.io.*;
import java.util.*;

public class boj1546 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        float arr[] = new float[N];
        float max=0;
        float avg=0;
        for(int i=0;i<arr.length;++i){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for (int j=0;j< arr.length;++j){
            avg+=arr[j]*100/max;
        }
        avg/=N;
        System.out.println(avg);

    }
}

