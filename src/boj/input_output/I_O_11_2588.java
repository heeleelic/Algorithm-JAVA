package boj.input_output;

import java.io.*;

public class I_O_11_2588 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine()); //나눠지는 수
        int y = Integer.parseInt(br.readLine()); //나누는 수

        int a = y%10; //385%10=5
        int b = (y/10)%10; //(385/10)%10=8
        int c = y/100; //385/100=3

        bw.write(String.valueOf(x*a)+"\n"); //472*5
        bw.write(String.valueOf(x*b)+"\n"); //472*8
        bw.write(String.valueOf(x*c)+"\n"); //472*3
        bw.write(String.valueOf(x*y));

        bw.flush();
        bw.close();
        br.close();


    }
}
