package boj.array;

import java.io.*;

public class A_4_2562 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];
        for(int i=0;i<9;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        int max = num[0];
        int index = 1;
        for(int j=0;j<9;j++){
            if(num[j]>max) {
                max=num[j];
                index=j+1;
            }
        }
        bw.write(String.valueOf(max)+"\n"+String.valueOf(index));
        bw.flush();
        bw.close();
        br.close();
    }
}
