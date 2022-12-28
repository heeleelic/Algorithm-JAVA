package boj.contion;

import java.io.*;

public class C_2_9498 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());

        if(score>89) {
            bw.write("A");
        } else if(score>79){
            bw.write("B");
        } else if(score>69) {
            bw.write("C");
        } else if(score>59){
            bw.write("D");
        } else {
            bw.write("F");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
