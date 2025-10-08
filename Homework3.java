import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력하시겠습니까? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.print("숫자를 입력하세요:\n");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

    }
}
