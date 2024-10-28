class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.contains("-")){
            int num = Integer.parseInt(s.replace("[^0-9]", ""));
            
            answer = num;
        }else{
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}