package ex01;

import java.util.Scanner;

public class Back2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] abc = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(String var : abc){
            str = str.replace(var ,"A");
        }
        System.out.println(str.length());
    }
}
