package com.devakumaran.assigement4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read ticket booking details in CSV format
        
        System.out.println("Enter the customer detail:");
        String[] input = sc.nextLine().split(",");
        TicketBooking booking = new TicketBooking(input[0], input[1], Integer.parseInt(input[2]));

        System.out.println("Enter the their choice :");
        
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        booking.displayBooking();

        switch (choice) {
            case 1: // Cash
            	System.out.println("Enter the cash amount:");
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;
                
                
            case 2: // Wallet
              	System.out.println("Enter the wallet amount:");
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                System.out.println("Enter the Number : ");
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;
                
                
            case 3: // Credit Card
            	System.out.println("Enter the Name of the person");
                String holderName = sc.nextLine();
              	System.out.println("Enter the cash amount:");
                double cardAmount = sc.nextDouble();
                sc.nextLine();
              	System.out.println("Enter the Card Type:");
                String cardType = sc.nextLine();
              	System.out.println("Enter the CVV number:");
                String ccv = sc.nextLine();
                booking.makePayment(holderName, cardAmount, cardType, ccv);
                break;
                
                
            default:
                System.out.println("Invalid choice");
                System.out.println("Please enter the valid  type :!!");
        }
        sc.close();
    }
}


