public class factorial {
    public static int calcfactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact1 = calcfactorial(n-1);
        int fact2 = n*fact1;
        return fact2;
    }

    public static void main(String[]args) {
        int n = 9;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}
