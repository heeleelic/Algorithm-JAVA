package boj.roof;

import java.io.*;

public class R_12_1110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine()); //입력 숫자
        int count=0; //반복 횟수
        int copy=n; //새로운 숫자로 바뀌는 과정을 거친 후, 초기 입력 숫자와 비교할 때 사용



        while(true){
            int ten=n/10; //숫자의 십의자리
            int one=n%10; //숫자의 일의자리
            int num=ten+one; //자릿수의 합
            n=(one*10)+(num%10); //새로운 숫자
            count++;

            if(n==copy) break;

        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
