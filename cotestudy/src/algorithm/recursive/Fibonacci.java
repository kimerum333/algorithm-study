package algorithm.recursive;

public class Fibonacci {

    static int solution(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return solution(n-1)+solution(n-2);
    }

    public static void main(String[] args) {
        int N = 6; // 6번째 피보나치 수 구하기
        System.out.println("Fibonacci(" + N + ") = " + Fibonacci.solution(N));
    }
}
