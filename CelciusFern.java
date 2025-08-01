public class CelciusFern {
    // Fehrenheit=((celcius*9)/5)+32)
    // celcius=((f-32)*5)/9
    static double fehrenheit(double celcius) {
        return (((celcius * 9) / 5) + 32);
    }

    static double celcius(double fehrenheit) {
        return (((fehrenheit - 32) * 5) / 9);
    }

    public static void main(String[] args) {
        System.out.println("Feh: " + fehrenheit(37));
        System.out.println("celcius: " + celcius(98.6));
    }
}
