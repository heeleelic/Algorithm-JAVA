package nacoding.implementation;

import java.util.Scanner;

public class LRUD_01 {
    public static void main(String[] args) {



        //n을 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); //버퍼 비우기
        String[] plans = sc.nextLine().split(" "); //계획서를 공백으로 구분하여 받기
        int x=1, y=1; //출발 좌표 설정하기

        /*int n = 5;
        char[] plans = {'R','R','R','U','D','D'};
        int x=1, y=1;*/

        //L,R,U,D에 따른 이동 방향 설정
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        char[] moveTypes = {'L','R','U','D'};

        //이동 계획을 하나씩 확인
        for(int i=0;i<plans.length;i++){ //plans의 길이만큼(행,고정)
            char plan = plans[i].charAt(0); //0~끝까지 하나씩(열, 가변)

            /*상하좌우 1씩 이동하는 반복문
            *그런데 출발 좌표가 {0,0}이 아니라 {1,1}이므로
            * 움직임의 초깃값을 -1로 세팅해야 1씩 움직일 수 있다.*/
            int nx=-1, ny=-1;
            for(int j=0;j<4;j++){
                if(plan==moveTypes[j]){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            //공간을 벗어나는 경우 무시하고 다음 회차로
            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;

            //이동 수행
            x = nx;
            y = ny;

        }

        System.out.println(x+" "+y);





    }
}
