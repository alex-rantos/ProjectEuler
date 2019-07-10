package problems;

public class fibonacciEvenSum {
    public void findSum() {
        long []f = {0,2};
        long sum = 0,
                prev=0;


        while (f[1] < 4000000) {
            sum += f[1];
            prev = f[1];
            f[1] = 4 * f[1] + f[0];
            f[0] = prev;
        }

        System.out.println("The sum of the even-valued terms is ["+sum+"]");
    }
}
