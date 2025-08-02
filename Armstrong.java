public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int temp = n;
        int digit = 0;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        int rs = n;
        while (rs > 0) {
            int r = rs % 10;
            sum += Math.pow(r, digit);
            rs = rs / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }

}
