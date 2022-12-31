package boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class A_2_10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] array = new int[n];

        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i]<x) bw.write(String.valueOf(array[i])+" ");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
