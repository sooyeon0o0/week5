import java.util.Scanner;

// do - while 사용
// 사용자의 나이를 입력받고, 0 이상의 값이 입력될 때까지 입력을 받는 프로그램을 작성하세요.
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        do{
            System.out.println("나이를 입력하세요(0 이상의 값). ");
            age = sc.nextInt();
        } while (age < 0);
        System.out.println("입력하신 값은 : " + age + ", 종료합니다.");
    }
}
