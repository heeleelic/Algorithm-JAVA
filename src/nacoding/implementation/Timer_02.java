package nacoding.implementation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Timer_02 {
    public static void main(String[] args) {

        //n 입력받기
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();*/

        int n=5;
        int count=0;

        //시,분,초마다 3 들어가는지 확인
        for(int i=0;i<=n;i++){ //시
            for(int j=0;j<60;j++){ //분
                for(int k=0;k<60;k++){ //초

                    String time=String.valueOf(i)+String.valueOf(j)+String.valueOf(k);
                    if(time.contains("3")) count++;


                }
            }
        }

        System.out.println(count);

    }
}
