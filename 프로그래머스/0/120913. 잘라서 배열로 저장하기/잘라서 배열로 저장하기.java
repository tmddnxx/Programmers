import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> result = new ArrayList<>();
        
        for(int i=0; i<my_str.length(); i+=n){
            result.add(my_str.substring(i, Math.min(i+n, my_str.length())));
        }
        
        return result.toArray(new String[0]);
    }
}