import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        boolean isNegative = a < 0;
        System.out.println(isNegative);

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        boolean isPositive = b > 0;
        System.out.print(isPositive);
    }




}