package boj.input_output;

import java.io.*;
import java.util.StringTokenizer;

public class I_O_9_3003 {
    public static void main(String[] args) throws IOException {

        int a,b,c,d,e,f;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        c=Integer.parseInt(st.nextToken());
        d=Integer.parseInt(st.nextToken());
        e=Integer.parseInt(st.nextToken());
        f=Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(1-a)+" ");
        bw.write(String.valueOf(1-b)+" ");
        bw.write(String.valueOf(2-c)+" ");
        bw.write(String.valueOf(2-d)+" ");
        bw.write(String.valueOf(2-e)+" ");
        bw.write(String.valueOf(8-f));

        bw.flush();
        bw.close();
        br.close();

    }
}
