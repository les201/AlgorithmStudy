package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj2480 {
    public static BufferedReader br;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int x, y, z, result = 0;
        Integer[] dice = new Integer[3];
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < dice.length; ++i) {
            dice[i] = Integer.parseInt(st.nextToken());
        }

        if (dice[0] == dice[1] && dice[1] == dice[2] && dice[2] == dice[0]) { //3개 같을 때
            result = 10000 + dice[0] * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[0]) { //2개 같을 때
            if (dice[0] == dice[1] || dice[0] == dice[2]) {
                result = 1000 + dice[0] * 100;
            }
            if (dice[1] == dice[2]) {
                result = 1000 + dice[1] * 100;
            }
        } else { //제각각
            Arrays.sort(dice, Collections.reverseOrder());
            result = dice[0] * 100;
        }
        System.out.println(result);
    }
}
