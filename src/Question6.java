
import java.util.Scanner;

// 두 개의 숫자를 입력받아 그 숫자들의 최대공약수를 (구하기 while문 사용)
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해주세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요: ");
        int num2 = sc.nextInt();

        int temp = 0;

        while (num2 != 0) {
            temp = num2;                    // num2  = 값 유지
            num2 = num1 % num2;             //
            num1 = temp;

        }
        System.out.println("최대공약수: " + num1);
    }
}


//-> 자연수 a,b 에 대해서 -> a를 b로 나눈 나머지는 r 이라고 할때
//-> a,b의 최대 공약수는, b,r의 최대 공약수와 같다. 이런것에 따라
//-> r을 구하고 b를 r로 나눈 후 나머지를 구한다.
//-> 나머지가 0이 되면 이때 나누었던 b가 최대 공약수가 된다