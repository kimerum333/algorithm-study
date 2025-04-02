package algorithm.sort;

import algorithm.sort.insertion.InsertionSort;

import java.util.Arrays;

public class SortTester {
    public static void main(String[] args) {
        Sort sort = new InsertionSort();

        int[] array = {1,2,5,3,7,8,1,1,1,2,3,5};
        sort.solution(array);
        System.out.println(Arrays.toString(array));
    }
}
