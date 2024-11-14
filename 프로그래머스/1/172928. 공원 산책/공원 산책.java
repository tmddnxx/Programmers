class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] map = new String[park.length][park[0].length()];
        int[] start = new int[2];

        // park로 map만들기
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                map[i][j] = String.valueOf(park[i].charAt(j));
                if(map[i][j].equals("S")){
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        
        // start부터 이동명령 실행
        for(String route : routes){
            String[] direction = route.split(" ");
            String dir = direction[0]; // 방향
            int steps = Integer.parseInt(direction[1]); // 거리
            
            int currentRow = start[0]; // 현재 행
            int currentColumn = start[1]; // 현재 열
            boolean isBlock = false;
            
            for(int s=0; s<steps; s++){
                    switch(dir){
                        case "E" : currentColumn += 1; 
                            break;
                        case "W" : currentColumn -= 1;
                            break;
                        case "N" : currentRow -= 1;
                            break;
                        case "S" : currentRow += 1;
                            break;
                }
                
                if(currentRow < 0 || currentRow >= map.length || currentColumn < 0 || currentColumn >= map[0].length || map[currentRow][currentColumn].equals("X") ){
                    isBlock = true;
                    break;
                }    
            }
            
            if(!isBlock){
                    start[0] = currentRow;
                    start[1] = currentColumn;
                }
            
        }

        // 최종 위치 반환
        return start;
    }
}
