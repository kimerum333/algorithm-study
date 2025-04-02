package algorithm.search.binarysearch;

public class BinarySearchBasic implements BinarySearch{
    public int solution(int[] array, int number){

        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int middle = low+(high-low)/2;
            if(array[middle]==number){
                return middle;
            }

            if(array[middle]<number){
                low = middle+1;
            }else {
                high = middle-1;
            }
        }
        return -1;
    }



}
