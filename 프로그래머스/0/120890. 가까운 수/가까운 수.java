class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int idx = 0;
        int minDifference = 100;  
        
        for (int i = 0; i < array.length; i++) {
            int currentDifference = Math.abs(n - array[i]);

            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                idx = i;
            } 
   
            else if (currentDifference == minDifference) {
                if (array[i] < array[idx]) {
                    idx = i;
                }
            }
        }
        
        return array[idx]; 
    }
}