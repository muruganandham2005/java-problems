import java.util.Scanner;

public class checkcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the character : ");
        char x = in.next().trim().charAt(0);
        if (x >='a'&& x <= 'z'){
            System.out.println("the givent character is lowercase");
        }else {
            System.out.println("the given character is uppercase");
        }
    }
}
