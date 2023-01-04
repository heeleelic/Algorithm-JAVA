package nacoding.greedy;

import java.util.Scanner;

public class UntilOne_3 {
    public static void main(String[] args) {

        //문제) 자연수 n을 2가지 방법을 통해 1이 될 때까지 계산하는 최소 횟수를 구한다.
        //방법 1-n에서 1을 뺀다, 방법 2-n을 k로 나눈다
        //(조건: n은 k보다 항상 크거나 같다. 2<=n,k<=1,000,000)

        //로직) 케이스 3개 정도 손으로 하고 나니까 규칙을 알게 됐다.
        //그래서 규칙을 최대한 반복문과 조건문으로 풀어내고자 했다.
        //어차피...배운 거에 답이 있으니까...

        int n=19;
        int k=4;

        //n이 k의 배수가 아니면 -1, k의 배수면 나누는 연산 반복하기
        int result=0;

        while(true){

            if(n%k!=0){
                if(n==1) break;
                n-=1;
                result++;
            }
            else {
                if(n==1) break;
                n/=k;
                result++;
            }
        }

        System.out.println(result);






    }
}
