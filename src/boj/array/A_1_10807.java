package boj.array;

import java.io.*;
import java.util.StringTokenizer;

public class A_1_10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine()); //정수 개수 n=11
        int[] num=new int[n]; //정수 배열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }

        int count=0;
        int v = Integer.parseInt(br.readLine()); //찾을 정수


        for(int j=0;j<num.length;j++){
            if(num[j]==v) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
