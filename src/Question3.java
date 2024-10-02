import java.util.Scanner;

// 사용자가 1 이상의 숫자를 입력할 때까지 입력을 반복받고,
// 입력한 값을 출력하는 프로그램을 작성하세요.
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        do{
            System.out.println("1이상의 숫자를 입력해주세요: ");
            num = sc.nextInt();
        } while (num < 1);
        System.out.print("1이상의 숫자입니다. 종료합니다.");

    }
}
