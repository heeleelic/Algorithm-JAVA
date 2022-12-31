package boj.array;

import java.io.*;

public class A_8_8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];

        for(int i=0;i<t;i++){
            arr[i] = br.readLine();
        }

        for(int j=0;j<arr.length;j++){
            int correct=0;
            int cnt=0;

            for(int k=0;k<arr[j].length();k++){
                char a = arr[j].charAt(k);
                if(a=='O') correct++;
                else correct=0;
                cnt+=correct;
            }
            bw.write(String.valueOf(cnt)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();



    }
}
