// 1부터 10까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.
public class Question5 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
        /* 혹은
        for (int i =1; i<=10; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
         */
    }
}
