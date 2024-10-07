import java.util.Scanner;

// for 문을 사용하여 입력받은 숫자의 팩토리얼을 계산하기
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int a = sc.nextInt();
        int factorial = 1;

        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(a + "의 팩토리얼 값은 : " + factorial);
    }
}