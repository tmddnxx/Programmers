class Solution {
    public int solution(int price) {
        double discount = 1.0; // 기본 할인율 1.0은 할인 없음

        // 할인 기준 적용
        if (price >= 500000) {
            discount = 0.80; // 50만 원 이상은 20% 할인
        } else if (price >= 300000) {
            discount = 0.90; // 30만 원 이상은 10% 할인
        } else if (price >= 100000) {
            discount = 0.95; // 10만 원 이상은 5% 할인
        }

        double finalPrice = price * discount;

        return (int) finalPrice;
    }
}
