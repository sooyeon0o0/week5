//  1부터 100 사이에서 50을 찾으면 반복을 중단하는 프로그램을 작성하세요.
public class Question4 {
    public static void main(String[] args) {
        for( int i = 1; i <= 100; i++){
            System.out.println("i = "+i);
            if (i == 50){
                break;
            }
        }
    }
}
