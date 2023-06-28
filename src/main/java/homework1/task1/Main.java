package homework1.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Entry your number: ");
        int n = scanner.nextInt();
        int a = 1;
        int b = n;
        for (int i = 0; i <= n; i++) {
            a += 1;
            b *= 1;
        }
        System.out.printf("The sum of numbers %d: %d\n", n, a);
        System.out.printf("The product of number %d: %d\n", n, b);
        scanner.close();
    }

}
