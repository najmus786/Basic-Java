import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
        char ans[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        for (int i = 0; i < ans.length; i++) {
            if (ch == ans[i]) {
                System.out.println("Entered Char is Vowel");
                return;
            }
        }
        System.out.println("Entered char is not Vowel");
        sc.close();
    }

}
