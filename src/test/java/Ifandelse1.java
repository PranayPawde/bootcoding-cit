import java.util.Scanner;

public class Ifandelse1 {
    public static void main(String[] ayrgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();
        if (x==y){
            System.out.println("numbers are same!");
        }
        else{
            System.out.println("numbers arre different");
        }
    }
}
