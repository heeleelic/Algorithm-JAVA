package nacoding.implementation;

import java.util.Scanner;

public class Knight_1 {
    public static void main(String[] args) {

        //현재 나이트의 위치 입력받기
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();

        //입력 값을 좌표로 만들기
        int row=st.charAt(1)-'0';
        int column=st.charAt(0)-'a'+1;

        //이동 경로 설정하기
        int[][] steps={{2,1},{2,-1},{-2,1},{-2,-1},{-1,2},{1,2},{-1,-2},{1,-2}};


        //반복문-8*8 정사각형 안에서 이동 가능한지 확인
        int count=0;
        for(int[] path:steps){
            //이동 위치 확인
            int nextRow= row+path[0];
            int nextColumn= column+path[1];
            //이동 가능하면 카운트 증가
            if(nextRow>=1 && nextRow<=8 && nextColumn>=1 && nextColumn<=8){
                count++;
            }
        }

        //카운트 출력
        System.out.println(count);


    }
}
