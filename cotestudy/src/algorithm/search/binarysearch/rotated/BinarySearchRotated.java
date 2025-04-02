package algorithm.search.binarysearch.rotated;

public class BinarySearchRotated {

    public static int solution(int[] array, int target, int low, int high){

        int middle = low+(high-low)/2;

        if(low>high){
            return -1;
        }
        if(array[middle]==target){
            return middle;
        }

        if(array[middle]<=array[high]){
            //오른쪽이 정렬된 경우
            if(array[middle]<=target && target<=array[high]){
                //오른쪽 구간 내에 값이 있는 경우 계속 오른쪽에서 이진탐색.
                return solution(array,target,middle+1,high);
            }else{
                //왼쪽 구간 내에서 이진탐색.
                return solution(array,target,low,middle-1);
            }
        }else{
            //왼쪽이 정렬된 경우
            if(array[low]<=target && target<=array[middle]){
                //왼쪽 구간에 타겟이 있으면 왼쪽에서 이진탐색
                return solution(array,target,low,middle-1);
            }else{
                //오른쪽 구간에서 이진탐색
                return solution(array,target,middle+1,high);
            }
        }
    }
}
