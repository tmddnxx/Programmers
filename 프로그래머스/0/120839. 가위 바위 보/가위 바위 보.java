class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<rsp.length(); i++){
            char curChar = rsp.charAt(i);
            
            if(curChar == '2'){
                answer.append("0");
            }else if(curChar == '0'){
                answer.append("5");
            }else if(curChar == '5'){
                answer.append("2");
            }
        }
        
        return answer.toString();
    }
}