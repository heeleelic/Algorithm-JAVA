package boj.roof;

import java.io.*;
import java.util.StringTokenizer;

public class R_6_11021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());

        for(int i=0;i<test;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum=a+b;
            bw.write("Case #"+(i+1)+": "+sum+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
