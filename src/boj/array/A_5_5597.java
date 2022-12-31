package boj.array;

import java.io.*;

public class A_5_5597 {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    boolean[] stu = new boolean[31];

    for(int i=0;i<28;i++){
        int submit = Integer.parseInt(br.readLine());
        stu[submit] = true;
    }

    for(int j=1;j<stu.length;j++){
        if(stu[j]!=true) bw.write(String.valueOf(j)+"\n");
    }
    bw.flush();
    bw.close();
    br.close();
    }
}
