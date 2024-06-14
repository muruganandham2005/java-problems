import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operator,n1,n2;
        System.out.println("1 - addition \n 2 - subtraction \n 3 - multiplication \n 4 - division");
        System.out.print("choose the operator : ");
        operator = in.nextInt();
        System.out.print("enter the first number : ");
        n1 = in.nextInt();
        System.out.print("enter the second number : ");
        n2 = in.nextInt();

        int result = 0;
        switch (operator) {
            case 1:
                result = n1 + n2;
                break;

            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;

            case 4:
                result = n1 / n2;
                break;

            default:
                System.out.println("entered invalid operator");
        }
        System.out.println("Result is :" + result);


    }
}
