package boj.input_output;

import java.io.*;

public class I_O_7_10926 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nick = br.readLine();

        bw.write(nick+"??!");
        bw.flush();
        bw.close();
        br.close();

    }
}
