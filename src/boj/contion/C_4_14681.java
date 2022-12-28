package boj.contion;

import java.io.*;

public class C_4_14681 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if((x>0)&&(y>0)){
            bw.write(String.valueOf(1));
        } else if ((x<0)&&(y>0)) {
            bw.write(String.valueOf(2));
        } else if ((x<0)&&(y<0)){
            bw.write(String.valueOf(3));
        } else {
            bw.write(String.valueOf(4));
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
