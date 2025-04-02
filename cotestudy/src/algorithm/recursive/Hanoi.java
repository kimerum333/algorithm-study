package algorithm.recursive;

public class Hanoi {

    static int solution(int diskToMove, char from, char to, char aux) {
        if (diskToMove == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return 1;
        }

        int moves = 0;
        moves += solution(diskToMove - 1, from, aux, to);  // 작은 원판 N-1개를 보조 기둥(aux)로 이동
        System.out.println("Move disk " + diskToMove + " from " + from + " to " + to); // 가장 큰 원판 이동
        moves++;
        moves += solution(diskToMove - 1, aux, to, from);  // 보조 기둥(aux)에 있는 N-1개를 목표 기둥(to)으로 이동

        return moves;
    }

    public static void main(String[] args) {
        int N = 3; // 원판 개수
        int totalMoves = solution(N, 'A', 'C', 'B');
        System.out.println("Total moves: " + totalMoves);
    }
}
