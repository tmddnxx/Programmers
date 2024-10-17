class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int a=i; a<=j; a++){
            str += String.valueOf(a);
        }
        char[] c = str.toCharArray();
        
        for(int b = 0; b<c.length; b++){
            if(c[b] == k+'0'){
                answer++;
            }
        }
   
        return answer;
    }
}