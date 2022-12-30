package boj.roof;

import java.io.*;
import java.util.StringTokenizer;

public class R_4_25304 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x=Integer.parseInt(br.readLine()); //영수증 금액
        int n=Integer.parseInt(br.readLine()); //물건 가짓수
        int total=0; //대조용 금액 합

        for(int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()); //물건 가격
                int b = Integer.parseInt(st.nextToken()); //물건 개수
                int sum = a * b;
                total += sum;
        }

        if(total==x) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
