package algorithm.sort.bubble;

import algorithm.sort.Sort;

public class BubbleSort implements Sort {
    public void solution(int[] array){

        int swapCount = 0;

        for(int i=0;i< array.length;i++){
            boolean alreadySorted = true;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    alreadySorted = false;
                    swapCount++;
                }
            }
            if(alreadySorted) break;
        }
        System.out.println("swapCount ="+swapCount);
    }
}
