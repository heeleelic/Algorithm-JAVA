package boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class A_7_1546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        double[] score = new double[n];
        double max = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            score[i]=Integer.parseInt(st.nextToken());
            if(score[i]>max) max=score[i];
        }

        for(int j=0;j<n;j++){
            score[j]=(score[j]/max)*100;
            sum+=score[j];
        }

        double avg=sum/(double)n;

        bw.write(String.valueOf(avg));
        bw.flush();
        bw.close();
        br.close();


    }
}
