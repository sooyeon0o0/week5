// for 문을 사용하여 구구단 중 7단을 출력하는 프로그램을 작성하세요.

public class Question1 {
    public static void main(String[] args) {
        int n =7;

        for(int i=1;i<=9;i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}

/*
=> 구구단 전체 출력
public class Question1 {
    public static void main(String[] args) {
        for(int i =2; i<=9; i++){
            for (int j =1; j<=9; j++){
                System.out.print(i+" * "+j+" = "+(i*j)+ "\t");
            }
        }
        System.out.println("");
    }
}
*/