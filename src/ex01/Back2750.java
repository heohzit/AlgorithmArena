package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Back2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //배열 크기 입력받기
        int[] arr = new int[num]; //배열

        for(int i=0;i<num;i++){ //수 입력받기
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for(int val :arr){
            System.out.println(val);
        }
    }
}
