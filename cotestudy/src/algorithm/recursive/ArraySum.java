package algorithm.recursive;

public class ArraySum {
    static int sumArray(int[] input,int index){
        if(index == input.length-1){
            return input[index];
        }
        return input[index]+sumArray(input,index+1);

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // 배열 선언
        int totalSum = sumArray(arr, 0); // 배열 합 계산
        System.out.println("Sum: " + totalSum);
    }
}
