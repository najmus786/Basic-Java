public class LeapYear {
    static void leap(int year){
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap year");
        }
    }
    public static void main(String[] args) {
        leap(2000);
    }
    
}
