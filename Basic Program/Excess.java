//Số dư thừa là số có tổng các ước lớn hơn chính nó.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // get input value for number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // variable to store the sum of all divisors
        int sum = 0;

        // run loop to find the divisor of number
        for (int i = 1; i < number; ++i) {

            // check if i is divisor of number
            if (number % i == 0) {
                // if true, add i to sum
                sum += i;
            }
        }

        // check if sum is greater than number
        if (sum > number) {
            System.out.println("Abundant Number");
        }
        else {
            System.out.println("Not an Abundant Number");
        }
                
        input.close();
    }
}

