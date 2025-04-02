package algorithm.sort.quick;

import algorithm.sort.Sort;

public class QuickSort implements Sort {

    @Override
    public void solution(int[] array) {
        recursiveQuickSort(array,0,array.length-1);
    }

    private void recursiveQuickSort(int[] array, int leftEnd, int rightEnd){
        if(leftEnd>=rightEnd){ return; }
        int pivotIndex = partition(array,leftEnd,rightEnd);

        recursiveQuickSort(array,leftEnd,pivotIndex-1);
        recursiveQuickSort(array,pivotIndex+1,rightEnd);
    }

    private int partition(int[] array, int leftEnd, int rightEnd){
        int pivotValue = array[rightEnd];
        int sortedUntilHere = leftEnd;
        for(int i=leftEnd; i<rightEnd; i++){
            if(array[i] < pivotValue){
                swap(array,sortedUntilHere,i);
                sortedUntilHere++;
            }
        }
        swap(array,sortedUntilHere,rightEnd);
        return sortedUntilHere;
    }

    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
