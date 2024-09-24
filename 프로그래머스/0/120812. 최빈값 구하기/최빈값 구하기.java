import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        
        // 배열에서 가장 큰 값을 찾아 max를 설정
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        
        // 등장 횟수를 세기 위한 배열 생성
        int cnt[] = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }

        // 최빈값을 찾기 위한 변수들
        int mostFrequent = -1;  // 최빈값
        int maxCount = 0;       // 최빈값의 등장 횟수
        boolean isDuplicate = false;  // 최빈값이 여러 개 존재하는지 확인

        // cnt 배열을 순회하면서 최빈값을 찾음
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > maxCount) {
                maxCount = cnt[i];
                mostFrequent = i;
                isDuplicate = false;  // 새로운 최빈값 발견 시 중복 해제
            } else if (cnt[i] == maxCount) {
                isDuplicate = true;  // 같은 등장 횟수를 가진 값이 있으면 중복 설정
            }
        }

        // 최빈값이 여러 개면 -1 반환
        if (isDuplicate) {
            answer = -1;
        } else {
            answer = mostFrequent;
        }
        
        return answer;
    }
}
