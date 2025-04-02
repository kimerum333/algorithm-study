package algorithm.sort.selection;

import algorithm.sort.Sort;

public class SelectionSort  implements Sort {
    public void solution(int[] array){
        for(int i=0;i<array.length-1;i++){
            int minimumIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minimumIndex]){
                    minimumIndex = j;
                }
            }
            if(i!=minimumIndex){
                int temp = array[i];
                array[i] = array[minimumIndex];
                array[minimumIndex] = temp;
            }
        }
    }
}
