package algorithm.search.binarysearch;

public class Tester {



    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearchRecursive();

        // ✅ Case 1: 배열에 값이 존재하는 경우 (정상 작동)
        int[] array1 = {1, 5};
        System.out.println(binarySearch.solution(array1, 5));  // 기대 출력: 1

        // ✅ Case 2: 배열에 값이 없는 경우
        int[] array2 = {1, 3, 5, 7, 9};
        System.out.println(binarySearch.solution(array2, 4));  // 기대 출력: -1

        // ✅ Case 3: 배열의 첫 번째 원소 찾기
        int[] array3 = {2, 4, 6, 8, 10};
        System.out.println(binarySearch.solution(array3, 2));  // 기대 출력: 0

        // ✅ Case 4: 배열의 마지막 원소 찾기
        System.out.println(binarySearch.solution(array3, 10));  // 기대 출력: 4

        // ✅ Case 5: 배열 크기가 1개일 때 (중요한 엣지 케이스!)
        int[] array4 = {42};
        System.out.println(binarySearch.solution(array4, 42));  // 기대 출력: 0
        System.out.println(binarySearch.solution(array4, 99));  // 기대 출력: -1

        // ✅ Case 6: 짝수 개수 배열 (중간값 위치 문제 확인)
        int[] array5 = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch.solution(array5, 5));  // 기대 출력: 2
        System.out.println(binarySearch.solution(array5, 6));  // 기대 출력: -1

        // ✅ Case 7: 음수 포함 배열 (음수 값도 올바르게 처리되는지 확인)
        int[] array6 = {-10, -5, 0, 3, 8, 12};
        System.out.println(binarySearch.solution(array6, -5));  // 기대 출력: 1
        System.out.println(binarySearch.solution(array6, 4));   // 기대 출력: -1
    }
}
