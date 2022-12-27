package boj.input_output;

import java.io.*;
import java.util.StringTokenizer;

public class I_O_6_10869 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());

         bw.write(String.valueOf(a+b)+"\n");
         bw.write(String.valueOf(a-b)+"\n");
         bw.write(String.valueOf(a*b)+"\n");
         bw.write(String.valueOf(a/b)+"\n");
         bw.write(String.valueOf(a%b)+"\n");

         bw.flush();
         bw.close();
         br.close();
    }
}
