
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Casona_CPE
 */
public class Factorial {
    public static void main(String[] args) {
        for (int n = 1; n <= 60; n++) {
            BigInteger result = factorial(n);
            System.out.println(result);
        }
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
