import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // players[0] = 1등, [1] = 2등 ...
        
        HashMap<String, Integer> playerRank = new HashMap<>();
        
        for(int i=0; i<players.length; i++){
            playerRank.put(players[i], i); // 선수이름, 순위
        }
        
        for(String calling : callings){
            int idx = playerRank.get(calling); // 불린 선수의 현재 순위
            
            if(idx > 0){ // 1위가 아니라면
                String prev = players[idx-1]; // 앞 선수 이름;
                players[idx] = prev;
                players[idx-1] = calling;
                
                playerRank.put(calling, idx-1);
                playerRank.put(prev, idx);
            }
        }
        
        
        return players;
    }
}