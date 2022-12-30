package boj.roof;

import java.io.*;
import java.util.StringTokenizer;

public class R_11_10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while((input=br.readLine()) !=null) {
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;
            bw.write(String.valueOf(sum)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
