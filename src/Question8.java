// while 문을 사용하여 1부터 100까지의 홀수의 합을 구하기
public class Question8 {
    public static void main(String[] args) {

        int a = 99;
        // int a = 100; 일때는 1~100까지의 짝수의 합

        int result = 0;

        while (a >= 1){
            result = result + a;
            a -= 2;
        }
        System.out.println(result);
    }
}