public class SimpleInterest {
    static double simpleInterest(double amount, double rate, int time) {
        double intrest = (amount * rate) / 100;
        double total = intrest * time;
        return total;
    }

    public static void main(String[] args) {
        double interest = simpleInterest(10000, 5, 5);
        System.out.println(interest);
    }

}
