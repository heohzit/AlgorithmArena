package ex01;

import java.util.Scanner;

public class Back25206_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학점 * 과목평점
        double aa = 0;
        // 총학점
        double point = 0;

        for (int i = 0; i < 20; i++) {
            // 과목
            String title = scanner.next();
            // 학점
            double a = scanner.nextDouble();
            // 평점
            String b = scanner.next();

            // 성적에 따른 학점 처리
            switch (b) {
                case "A+":
                    aa += a * 4.5;
                    point += a;
                    break;
                case "A0":
                    aa += a * 4.0;
                    point += a;
                    break;
                case "B+":
                    aa += a * 3.5;
                    point += a;
                    break;
                case "B0":
                    aa += a * 3.0;
                    point += a;
                    break;
                case "C+":
                    aa += a * 2.5;
                    point += a;
                    break;
                case "C0":
                    aa += a * 2.0;
                    point += a;
                    break;
                case "D+":
                    aa += a * 1.5;
                    point += a;
                    break;
                case "D0":
                    aa += a * 1.0;
                    point += a;
                    break;
                case "F":
                    aa += a * 0.0;
                    point += a;
                    break;
                default:
                    // 아무 작업도 하지 않음
                    break;
            }
        }

        System.out.printf("%.6f", aa / point);
    }
}
