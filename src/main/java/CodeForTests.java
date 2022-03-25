/**
 * Метод для тестирования в JUnit
 */
public class CodeForTests {

    public boolean isPrimeNumber(int n) {
        if (n == 0) {
            return true;
        }

        return divid(n, 2);
    }


    public static boolean divid(int n, int d) {
        if (n == d) {
            return true;
        }

        if (n % d == 0) {
            return false;
        } else {
            return divid(n, d + 1);
        }
    }

}
