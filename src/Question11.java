/*
     *
    ***
   *****
  *******
 *********
 -> 별 찍기 출력 (for문 두 개 사용)

public class Question11 {
    public static void main(String[] args) {

        int n =5;

        for (int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

// i = 1              i = 2
// n = 4              n = 4
// j = 1,2,3,4        j = 1,2,3,4


            for(int k=1; k<= i*2-1; k++) {
                System.out.print("*");
            }
// i = 1,2,3,4,5
// 1*2 - 1 = 1
// 2*2 - 1 = 3
// 3*2 - 1 = 5

            System.out.println("");
        }

    }
}
*/
// 번외 뒤집어서 찍기
public class Question11 {
    public static void main(String[] args) {

        int n =5;

        for (int i =n; i>=1; i--){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<= i*2-1; k++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}