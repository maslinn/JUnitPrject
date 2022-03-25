import java.util.Scanner;

public class ProjectMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number");
        int n = in.nextInt();

        CodeForTests codeForTests = new CodeForTests();
        boolean result = codeForTests.isPrimeNumber(n);

        System.out.println(result);
    }

}
