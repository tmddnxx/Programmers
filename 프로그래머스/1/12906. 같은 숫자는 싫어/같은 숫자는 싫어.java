import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 리스트
        List<Integer> resultList = new ArrayList<>();
        
        // 배열의 첫 번째 숫자는 항상 결과에 추가
        if (arr.length > 0) {
            resultList.add(arr[0]);
        }
        
        // 배열을 순회하며 연속된 숫자를 제거
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }
        
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
