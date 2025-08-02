public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal prime numbers between 1 and 100: " + count);
    }
}
