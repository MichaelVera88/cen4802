public class Main
{

    /**
     * Method using recursion to find the specific term within the Fibonacci sequence.
     * @param n Fibonacci sequence term
     * @return Value for the given term
     */
    public static int fib(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args)
    {
        int n = 10;
        int result = fib(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
    
}
