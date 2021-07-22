package com.company;
import java.util.Scanner;
public class Main {
    public static final short DefaultSalary = 200;
    public static void main(String[] args) {
        //task 1
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter num => ");
        int num = scanner.nextInt();
        for(int i = 0; i <= num; i++)
        {
            System.out.println(i);
        }
        //task 2

        System.out.print("Enter num 1 => ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num 2 => ");
        int num2 = scanner.nextInt();
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        System.out.print("Numbers");
        for(int i = start; i <= end; i++)
        {
            System.out.println(i);
        }
        int choice;
        do {
            System.out.println("1. Display all even numbers in the range.");
            System.out.println("2. Display all odd numbers in the range.");
            System.out.println("3. Display all numbers that are multiples of seven.");
            System.out.println("0. Exit.");
            System.out.print("Enter choice => ");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    for(int i = start; i <= end; i++)
                    {
                        if(i % 2 == 0)
                            System.out.println(i);
                    }
                    break;
                case 2:
                    for(int i = start; i <= end; i++)
                    {
                        if(i % 2 == 1)
                            System.out.println(i);
                    }
                    break;
                case 3:
                    for(int i = start; i <= end; i++)
                    {
                        if(i % 7 == 0)
                            System.out.println(i);
                    }
                    break;
            }
        }
        while (choice != 0);


        //task 3

        System.out.print("Enter num 1 => ");
        num1 = scanner.nextInt();
        System.out.print("Enter num 2 => ");
        num2 = scanner.nextInt();
        start = Math.min(num1, num2);
        end = Math.max(num1, num2);
        int sum = 0;
        for(int i = start; i <= end; i++)
        {
            sum += i;
        }
        System.out.print(sum);

        //task 4

        int amount = -1;
        do
        {
            ++amount;
            System.out.print("Enter num 1 => ");
            num = scanner.nextInt();
        }
        while (num != 0);
        System.out.print(amount);

        //task 5


        System.out.print("Enter width => ");
        int width = scanner.nextInt();
        System.out.print("Enter height => ");
        int height = scanner.nextInt();
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
                System.out.print("H ");
            System.out.println();
        }

        //task 6

        System.out.print("Enter width => ");
        width = scanner.nextInt();
        System.out.print("Enter height => ");
        height = scanner.nextInt();
        System.out.print("Enter char => ");
        char ch = scanner.next().charAt(0);

        for(int i = 1; i <= height; i++)
        {
            for(int j = 1; j <= width; j++)
            {
                if(i > 1 && i < height && j > 1 && j < width)
                    System.out.print(" ");
                else
                    System.out.print(ch );
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}