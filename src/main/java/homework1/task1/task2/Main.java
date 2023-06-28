package homework1.task1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input =  scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for(int i = 2; i <= input; i++){
            boolean isPrimeNumber = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber){
                primes.add(i);
            }
        }
        System.out.println("A prime numbers: " + primes);
    }
}