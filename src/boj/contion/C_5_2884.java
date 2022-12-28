package boj.contion;

import java.io.*;
import java.util.StringTokenizer;

public class C_5_2884 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m>=45){
            m-=45;
            bw.write(h+" "+m);

        } else{
            if(h==0){
                h=23;
                m=60-(45-m);
                bw.write(h+" "+m);
            } else {
                h-=1;
                m=60-(45-m);
                bw.write(h+" "+m);
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
