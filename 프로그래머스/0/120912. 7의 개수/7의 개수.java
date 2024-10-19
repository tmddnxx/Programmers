class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder stb = new StringBuilder();
        
        for(int i=0; i<array.length; i++){
            stb.append(array[i]+"");
        }
        
        for(int i=0; i<stb.length(); i++){
            if(stb.charAt(i) == '7'){
                answer++;
            }
        }
        System.out.println(stb);
        
        return answer;
    }
}