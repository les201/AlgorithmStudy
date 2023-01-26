package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj11724 {
    static BufferedReader br;
    static StringTokenizer st;
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        A = new ArrayList[n+1];
        visited = new boolean[n+1];
        for (int i = 1; i < n+1; ++i) { //초기화
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; ++i) { //u,v 기록
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }
        int count=0;
        for (int i = 1; i < n+1; ++i) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }//main
    static void DFS(int v){
        if (visited[v]==true){
            return;
        }
        visited[v]=true;
        for (int i:A[v]){
            if(visited[i]==false){
                DFS(i);
            }
        }
    }
}//class
