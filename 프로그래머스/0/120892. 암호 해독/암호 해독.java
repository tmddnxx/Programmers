class Solution {
    public String solution(String cipher, int code) {
        StringBuilder stb = new StringBuilder();
        
        String answer = "";
        
        for(int i=1; i<=cipher.length(); i++){
            if(i % code == 0){
                stb.append(cipher.charAt(i-1));
            }
        };
        
        answer = stb.toString();
        
        return answer;
    }
}