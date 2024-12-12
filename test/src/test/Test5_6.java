package test;

public class Test5_6 {
public static void main(String[] args) {
    int rows = 4; // 출력할 줄 수

    for (int i = 1; i <= rows; i++) {
        // 공백 출력
        for (int j = 1; j <= rows - i; j++) {
            System.out.print("  ");
        }
        // 별 출력
        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("* ");
        }
        System.out.println(); // 줄바꿈
    }
}
}
//      *
//    * * *
//  * * * * *
//* * * * * * *