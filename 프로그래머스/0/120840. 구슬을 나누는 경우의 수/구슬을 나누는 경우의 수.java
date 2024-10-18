import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        // 조합 계산: balls C share = balls! / ((balls-share)! * share!)
        BigInteger answer = factorial(BigInteger.valueOf(balls))
                            .divide(factorial(BigInteger.valueOf(balls - share))
                            .multiply(factorial(BigInteger.valueOf(share))));
        
        // 결과를 int로 반환, int 범위를 초과하면 예외 발생
        return answer.intValueExact(); // int 범위를 초과할 경우 예외 발생
    }

    private BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
