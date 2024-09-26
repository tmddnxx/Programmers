class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int yang = 12000 * n;
        int juice = 2000 * k;
        int service = 2000 * (n/10);
        
        int total = yang + juice - service;
        
        return total;
    }
}