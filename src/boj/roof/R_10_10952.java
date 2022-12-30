package boj.roof;

import java.io.*;
import java.util.StringTokenizer;

public class R_10_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0) break;

            int sum = a+b;
            bw.write(String.valueOf(sum)+"\n");

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
