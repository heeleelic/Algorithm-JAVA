package nacoding.greedy;

import java.util.Scanner;

public class NumCardGame_2 {
    public static void main(String[] args) {

        //문제) n행과 m열로 구성된 숫자 카드가 있다.
        //가장 큰 수를 뽑아야 하는데, 이는 각 행에서 가장 작은 수여야 한다.
        //예를 들어 {3,1,2},{1,4,3},{2,3,4} 에서는 세 번쨰 행의 2를 뽑을 수 있다.

        //로직) n행과 m열 입력 받기->한 줄씩 입력 받아 확인하기->
        //현재 줄에서 가장 작은 수 찾기->한 줄의 가장 작은 수에서 가장 큰 수 찾기
        //최종 답안 출력

        Scanner sc = new Scanner(System.in);

        //n행과 m열 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        //한 줄씩 입력 받아 확인하기
        for(int i=0;i<n;i++){

            //현재 줄에서 가장 작은 수 찾기
            int minValue = 10001; //1부터 10000까지 입력받음. 10001보다 작은 값이 될 것.
            for(int j=0;j<m;j++){
                int a = sc.nextInt();
                minValue = Math.min(minValue,a);
            }

            //한 줄의 가장 작은 수에서 가장 큰 수 찾기
            result = Math.max(result,minValue);
        }
        //최종 답안 출력
        System.out.println(result);

    }
}
