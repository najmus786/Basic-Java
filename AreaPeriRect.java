public class AreaPeriRect {
    static double area(double length, double breadth) {
        return length * breadth;
    }

    static double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        int length = 10;
        int breadth = 35;
        System.out.println("Area = " + area(length, breadth));
        System.out.println("Perimeter = " + perimeter(length, breadth));
    }

}
