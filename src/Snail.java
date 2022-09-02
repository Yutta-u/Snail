import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int n = 1;
        if (a < h) {
            System.out.println(n+=(h-a)/(a-b));
        } else {
            System.out.println((h-a)%(a-b)>0);
            n++;
        }
    }
}
