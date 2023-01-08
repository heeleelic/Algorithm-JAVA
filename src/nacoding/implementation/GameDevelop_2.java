package nacoding.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GameDevelop_2 {

    //필요 변수
    static int[][] map; //게임 맵
    static boolean[][] visit; //방문 경로
    static int playerDir; //캐릭터가 바라보는 방향
    static int playerRowPos,playerColPos; //캐릭터의 현재 위치
    static int[] dRow = {-1,0,1,0};
    static int[] dCol = {0,1,0,-1}; //북, 동, 남, 서쪽으로 한 칸씩 이동하는 움직임


    public static void main(String[] args) throws IOException {


        /* //n*m 크기 맵 생성
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]map = new int[n][m];
        sc.nextLine();

        //현재 좌표와 초기 방향
        int x=sc.nextInt();
        int y=sc.nextInt();
        int way=sc.nextInt();
        sc.nextLine();

        //맵 건설
        for(int i=0;i<n;i++){ //n행
            for(int j=0;j<m;j++){ //m열
                map[i][j]=sc.nextInt();
            }
            sc.nextLine();
        }*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //맵 크기 입력받기
        int mapRow=Integer.parseInt(st.nextToken());
        int mapCol=Integer.parseInt(st.nextToken());

        //맵과 방문 경로 배열 초기화
        map=new int[mapRow][mapCol];
        visit=new boolean[mapRow][mapCol];

        st=new StringTokenizer(br.readLine()); //줄바꿈

        //캐릭터의 현재 위치와 바라보는 방향 입력받기
        playerRowPos=Integer.parseInt(st.nextToken());
        playerColPos=Integer.parseInt(st.nextToken());
        playerDir=Integer.parseInt(st.nextToken());

        //캐릭터의 현재 위치는 방문함(true)
        visit[playerRowPos][playerColPos]=true;

        //지형(바다=1,육지=0) 입력받기
        for(int i=0;i<mapRow;i++){
            for(int j=0;j<mapCol;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int count=0; //4번 회전했는지 확인
        int visitCount=1; //몇 칸 방문했는지 확인. 현재 위치는 방문 상태이므로 1부터 시작.


        while(true){

            turnPlayer(); //현재 방향에서 왼쪽 방향 틀기

            //캐릭터의 방향에 맞게 좌표를 계산한 다음
            //그 칸이 0 이거나 방문하지 않은 칸이면 방문하고 방문 횟수를 1 증가.

            if((map[playerRowPos+dRow[playerDir]][playerColPos+dCol[playerDir]]==0)
            &&(visit[playerRowPos+dRow[playerDir]][playerColPos+dCol[playerDir]])==false){

                visit[playerRowPos+dRow[playerDir]][playerColPos+dCol[playerDir]]=true;
                visitCount++;

                playerRowPos += dRow[playerDir];
                playerColPos += dCol[playerDir];
                count=0;
            } else { //앞으로 갈 수 없다면 캐릭터를 회전시키고 회전한 횟수를 1 증가 시킨다.
                count++;
            }

            //회전한 횟수가 4라면 뒤로 갈 수 있는지 없는지 판단하는데 만약 갈 수 없으면 종료하고,
            if(count==4){
                if(map[playerRowPos-dRow[playerDir]][playerColPos-dCol[playerDir]]==1){
                    break;
                } else { //갈 수 있다면 뒤로 가고 회전한 횟수를 0으로 초기화
                    count=0;
                    playerRowPos-=dRow[playerDir];
                    playerColPos-=dCol[playerDir];
                }
            }
        }

        System.out.println(visitCount);

    }

    //초기 방향 북쪽이면(0) 서쪽(3), 동쪽(1)이면 북쪽(0), 남쪽(2)이면 동쪽(1), 서쪽(3)이면 남쪽(2)
    static void turnPlayer(){
        playerDir-=1;
        if(playerDir<0){
            playerDir=3;
        }
    }
}
