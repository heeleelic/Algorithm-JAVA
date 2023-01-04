package nacoding.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumRule_1 {
    public static void main(String[] args) {

        //문제) n개의 숫자를 받아 총 m번을 더한다 (한 숫자는 최대 k번까지)
        //더해서 가장 큰 값을 만드려면?

        //로직 1번)
        //1-1.숫자 배열 정렬하고 가장 큰 수, 두번째 큰 수를 뽑는다 (변수)
        //1-2. 가장 큰 수를 k번 더한다 (계산)
        //1-3. 두번째 큰 수를 1번 더한다 (계산)

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] data = new int[n];
        for(int i=0;i<data.length;i++){
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);

        int first = data[n-1];
        int second = data[n-2];

        int result=0;

        while(true) {
            //가장 큰 수를 k번 더한다
            for (int i = 0; i < k; i++) {
                if (m==0) break;
                result += first;
                m -= 1;
            }
            if (m==0) break;
            result += second;
            m -= 1;
        }

        System.out.println(result);





        //응용 로직 2번)
        //2-1. 반복되는 수열에서 가장 큰 수가 몇 번 나오는지 구하고 (계산)
        //2-2. 전체 m번에서 1번을 빼서 두번째 큰 수가 몇 번 나오는지 구한다 (계산)

        /*Scanner sc = new Scanner(System.in);

        //입력 숫자 갯수 n,더하는 횟수 m,연속 제한 k
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        //n개의 수를 담는 배열 arr 생성
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //배열 arr 정렬
        Arrays.sort(arr);
        int first = arr[n-1]; //가장 큰 수
        int second = arr[n-2]; //두번째로 큰 수

        //가장 큰 수가 더해지는 '횟수' 계산
        int cnt = (m/(k+1))*k; //수열이 m번 만큼 나누어 떨어질 때
        cnt += m%(k+1); //m번으로 나누어 떨어지지 않는 경우

        int result=0;
        result += cnt * first; //가장 큰 수 더하기
        result += (m-cnt)*second; //두번째로 큰 수 더하기

        System.out.println(result);*/


    }
}
