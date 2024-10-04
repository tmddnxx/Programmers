class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i=0; i<numbers.length; i++){
                if(i == 0){
                    answer[0] = numbers[numbers.length-1];
                }else{
                    answer[i] = numbers[i-1];
                }
            }
        }else{
            for(int i=0; i<numbers.length; i++){
                if(i == numbers.length-1){
                    answer[numbers.length-1] = numbers[0];
                }else{
                    answer[i] = numbers[i+1];
                }
            }
        }
        
        return answer;
    }
}