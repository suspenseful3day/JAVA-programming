import java.util.Scanner;

public class Homework4 {
    // 재귀호출
    public static int gcdRecursive(int m, int n) {
        if (n == 0)
            return m;

        return gcdRecursive(n, m % n);
    }

    // 반복문
    public static int gcdWhile(int m, int n) {
        while (n != 0) {
            int k = m % n;
            m = n;
            n = k;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수를 입력하세요: ");

        int m = sc.nextInt();
        int n = sc.nextInt();

        // 재귀호출 결과
        int resultRecursive = gcdRecursive(m, n);
        System.out.println("재귀호출로 구한 최대공약수: " + resultRecursive);

        // 반복문 결과
        int resultWhile = gcdWhile(m, n);
        System.out.println("반복문으로 구한 최대공약수: " + resultWhile);

    }
}
