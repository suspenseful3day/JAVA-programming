import java.util.Scanner;

public class Homework1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int a = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다\n", a);
        System.out.println("정수를 입력하세요: ");
        int b = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다\n", a+b);
        System.out.println("정수를 입력하세요: ");
        int c = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다\n", a+b+c);
        System.out.println("정수를 입력하세요: ");
        int d = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다\n", a+b+c+d);
        System.out.println("정수를 입력하세요: ");
        int e = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다\n", a+b+c+d+e);    
    }
}
