package boj.contion;

import java.io.*;
import java.util.StringTokenizer;

public class C_6_2525 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int d = (a*60)+b+c;

        if(d>=1440){
            a= (d-1440)/60;
            b= (d-1440)%60;
            bw.write(String.valueOf(a+" "+b));
        } else {
            a=d/60;
            b=d%60;
            bw.write(String.valueOf(a+" "+b));
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
