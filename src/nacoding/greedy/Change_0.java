package nacoding.greedy;

public class Change_0 {
    public static void main(String[] args) {

        //문제) 동전 개수를 가장 적게 해서 거스름돈 주기

        //로직) 거스름돈을 가장 큰 단위로 나누고->
        // 거스름돈 변화->
        // 그 다음 단위로 나누고->
        // 거스름돈 변화-> ...

        //거스름돈 n, 동전 갯수 cnt, 동전 종류 coinTypes
        int n=1260;
        int cnt=0;
        int[] coinTypes={500,10,50,10};

        //큰 단위의 동전부터 차례로 거스름돈 주기
        for(int i=0;i<coinTypes.length;i++){
            int coin=coinTypes[i];
            cnt+=n/coin;
            n%=coin;
        }
        System.out.println(cnt);
    }
}
