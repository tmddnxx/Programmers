class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        
        if(plusOrMinus(x) && plusOrMinus(y)){
            answer = 1;
        }else if(!plusOrMinus(x) && !plusOrMinus(y)){
            answer = 3;
        }else if(!plusOrMinus(x) && plusOrMinus(y)){
            answer = 2;
        }else if(plusOrMinus(x) && !plusOrMinus(y)){
            answer = 4;
        }
        
        return answer;
    }
    
    private boolean plusOrMinus(int n){
        if(n>0){
            return true;
        }else{
            return false;
        }
    }
    
}