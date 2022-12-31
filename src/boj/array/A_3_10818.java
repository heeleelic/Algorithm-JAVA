package boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class A_3_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }

        int max=num[0];
        int min=num[0];

        for(int j=0;j<n;j++){
            if(num[j]>max) max=num[j];
            if(num[j]<min) min=num[j];
        }

        bw.write(String.valueOf(min)+" "+String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();

    }
}
