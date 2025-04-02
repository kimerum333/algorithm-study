package algorithm.search.binarysearch;

public class BinarySearchRecursive implements BinarySearch{
    @Override
    public int solution(int[] array, int number) {
        return innerSolution(array,number,0,array.length-1);
    }

    private int innerSolution(int[] array, int number, int low, int high){
        if(low>high){
            return -1;
        }
        int middle = low+(high-low)/2;
        if(array[middle]==number){
            return middle;
        }
        if(number<array[middle]){
            return innerSolution(array,number,low,middle-1);
        }else {
            return innerSolution(array,number,middle+1,high);
        }
    }
}
