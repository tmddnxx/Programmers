class Solution {
    public int solution(String s) {
        int maxLen = 0;
        
        // 문자열의 각 문자에서 팰린드롬을 확장하는 함수
        for (int i = 0; i < s.length(); i++) {
            // 홀수 길이 팰린드롬 확장
            int len1 = expandAroundCenter(s, i, i);
            // 짝수 길이 팰린드롬 확장
            int len2 = expandAroundCenter(s, i, i + 1);
            // 최대 길이 갱신
            maxLen = Math.max(maxLen, Math.max(len1, len2));
        }
        
        return maxLen;
    }
    
    // 주어진 중심에서 팰린드롬을 확장하는 함수
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // 팰린드롬의 길이 반환
        return right - left - 1;
    }
}
