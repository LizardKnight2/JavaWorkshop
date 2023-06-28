package homework1.task1.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int numb_a = scanner.nextInt();
        System.out.println("The symbols you can use: / * + - ");
        char operation;
        System.out.print("Enter a second number: ");
        int num_b = scanner.nextInt();
        operation = scanner.next().charAt(0);
        int res;
        switch (operation){
            case '+':
                res = numb_a + num_b;
                System.out.printf("Result: %d", res);
                break;
            case  '-':
                res = numb_a - num_b;
                System.out.printf("Result: %d", res);
                break;
            case '/':
                res = numb_a / num_b;
                System.out.printf("Result: %d", res);
                break;
            case '*':
                res = numb_a * num_b;
                System.out.printf("Result: %d", res);
                break;
        }
        scanner.close();
    }
}
