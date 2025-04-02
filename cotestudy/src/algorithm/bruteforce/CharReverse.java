package algorithm.bruteforce;

public class CharReverse {
    static char[] solution(char[] chars){
        if(chars.length<=1) return chars;


        int startIndex = 0;
        int endIndex = chars.length-1;
        while(startIndex<endIndex){
            char temp = chars[startIndex];
            chars[startIndex] = chars[endIndex];
            chars[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return chars;
    }

    public static void main(String[] args) {
        String balance = "balance";
        char[] chars = solution(balance.toCharArray());
        System.out.println(String.valueOf(chars));
    }
}
