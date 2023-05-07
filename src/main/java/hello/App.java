package hello;

/*
Read two numbers M and N indefinitely. Calculate and write the sum of their factorial.
Be carefull, because the result can have more than 15 digits.
Input
The input file contains many test cases. Each test case contains two integer
numbers M (0 ≤ M ≤ 20) and N (0 ≤ N ≤ 20). The end of file is determined by eof.
Output
For each test case in the input your program must print a single line, containing
a number that is the sum of the both factorial (M and N).
 */
public class App {

    public long factSum(int m, int n) {
        long factM = 1;
        long factN = 1;

        while (m > 0) {
            factM = factM * m;
            m--;
        }

        while (n > 0) {
            factN = factN * n;
            n--;
        }

        return factM + factN;
    }
}