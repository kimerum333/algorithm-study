package algorithm.recursive.tailrecursive;

public class SumTailResursive {

    //자연수 n을 받아 1부터 n까지의 합을 구하는 꼬리재귀함수.

    static int soulution(int n, Integer sum){
        if(n==0){
            return sum;
        }

        return soulution(n-1,sum+n);
    }

    public static void main(String[] args) {
        System.out.println(soulution(100000,0));
    }

}
