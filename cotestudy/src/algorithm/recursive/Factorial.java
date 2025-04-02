package algorithm.recursive;

public class Factorial {
    //n을 받아 n팩토리얼을 출력한다.

    static int solution(int n){
        if(n==1){
            System.out.print(n);
            System.out.println();
            return 1;
        }
        System.out.print(n+"*");
        return n*solution(n-1);
    }

    public static void main(String[] args) {

        System.out.println(Factorial.solution(10));

    }
}
