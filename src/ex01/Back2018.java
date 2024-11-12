package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back2018 {
    public static void main(String[] args) throws IOException { //2018
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int start = 0;
        int end = 0;
        int sum =0;
        int count = 0;

        while (start <= n) {
            if(sum == n) { //sum이 입력값과 같다면
                count++; //카운트 올리기
                sum += end; //총 합계
                end++; //마지막 값 올리기
            } else if(sum < n) {
                sum +=end;
                end ++;
            }else if (sum > n) {
                sum -= start;
                start++;
            }
        }

        System.out.println(count);

    }
}
