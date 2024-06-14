import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_1 = in.nextInt();
        int num_2 = in.nextInt();
        int num_3 = in.nextInt();
        int max = num_1;
        if (num_2 > max){
            max = num_2;
            if (num_3 > max){
                max = num_3;
            }
        }
        System.out.println(max);

    }
}
