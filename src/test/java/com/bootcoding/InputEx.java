import java.util.Scanner;

public class InputEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n = sc.nextInt();
        System.out.println("Enter Second Number:");
        int m = sc.nextInt();
        int add = n + m;
        System.out.println("addition="+add);

        int sub = n- m;
        System.out.println("substraction="+sub);

        int mul = n * m;
        System.out.println("multiplication="+mul);

        int div = n / m;
        System.out.println("division="+div);
    }
}