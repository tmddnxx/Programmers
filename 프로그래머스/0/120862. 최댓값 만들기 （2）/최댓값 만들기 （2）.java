import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        int answer2 = numbers[0] * numbers[1];
        
        
        return answer1 > answer2 ? answer1: answer2;
    }
}