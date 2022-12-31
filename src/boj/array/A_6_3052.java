package boj.array;

import java.io.*;
import java.util.HashSet;

public class A_6_3052 {
    public static void main(String[] args) throws IOException {


        //1.배열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       boolean[] mod = new boolean[42];

       for(int i=0;i<10;i++){
           int num = Integer.parseInt(br.readLine())%42;
           mod[num]=true;
       }

       int cnt=0;
       for(boolean value: mod){
           if(value) cnt++;
       }

       bw.write(String.valueOf(cnt));
       bw.flush();
       bw.close();
       br.close();


            //2.HashSet
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> mod = new HashSet<>();

        for(int i=0;i<10;i++){
            mod.add(Integer.parseInt(br.readLine())%42);
        }

        bw.write(String.valueOf(mod.size()));
        bw.flush();
        bw.close();
        br.close();*/


    }
}

