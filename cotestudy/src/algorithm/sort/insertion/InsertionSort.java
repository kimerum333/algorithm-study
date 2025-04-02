package algorithm.sort.insertion;

import algorithm.sort.Sort;

public class InsertionSort implements Sort {

    @Override
    public void solution(int[] array) {
        for(int i=0;i<array.length;i++){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
