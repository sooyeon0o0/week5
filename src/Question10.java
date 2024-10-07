import java.util.Scanner;

// 사용자가 입력한 n까지 숫자를 더한 후 n >= 100일 때 합을 출력하고, break로 종료하는 프로그램을 작성하세요. (break문 사용)
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        for(;num < 100;){
            System.out.println("숫자를 입력하세요(100이상 입력 시 중단): ");
            num = sc.nextInt();
            sum = sum + num;

            if(num >= 100){
                System.out.println("입력하신 숫자의 총 합은: " + sum);

                break;
            }
        }
    }
}
