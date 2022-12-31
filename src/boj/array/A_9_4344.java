package boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class A_9_4344 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine()); //테스트 케이스 수

        for(int i=0;i<c;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int stu = Integer.parseInt(st.nextToken()); //학생 수
            double[] score = new double[stu]; //점수 배열

            double sum = 0; //점수 합
            double avg = sum/(double)stu; //점수 평균
            double over = 0; //평균 넘는 애들

            for(int j=0;j<stu;j++){ //점수 배열 받기, 합 구하기, 평균 구하기
                score[j] = Integer.parseInt(st.nextToken());
                sum+=score[j];
                avg = sum/(double)stu;
            }

            for(int k=0;k<score.length;k++){
                if(score[k]>avg) over++;
            }

            double rate = (over/stu)*100;
            bw.write(String.format("%.3f",rate)+"%"+"\n");

        }

        bw.flush();
        bw.close();
        br.close();


    }
}
