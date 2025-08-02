public class SumNSquare {
    public static void main(String[] args) {
        // sum=1*1+2*2+3*3......+n*n
        int n = 2;
        int sum = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(sum);
    }

}
