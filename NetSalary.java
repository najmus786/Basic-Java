public class NetSalary {
    public static void main(String[] args) {
        double basic = 12000;
        double hra = basic * 30 / 100;
        double da = basic * 20 / 100;
        double ta = basic * 10 / 100;
        int pf = 1400;
        double NetSalary = basic + hra + da + ta - pf;
        System.out.println(NetSalary);

    }

}
