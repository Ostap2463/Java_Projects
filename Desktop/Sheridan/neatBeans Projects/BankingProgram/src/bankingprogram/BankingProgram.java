/*
        Name:  [Ostap Melnyk]
        Assignment:  [Assignmen1 Relise]
        Program: [Computer programmer]
        Date:  [22.01.2020]
    
        Description:This program I did better than last one. 
           In my opinion better lose a mark with late submition than with horrible code. 
       
 */
package bankingprogram;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.InputMismatchException;

public class BankingProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account banking = new Account();
        boolean isValid = true;
        int check = 0;
        while (isValid) {

            try {

                if (check == 0) {
                    System.out.print("Enter your account number: ");
                    banking.setAccountNo(input.nextLine());
                    check++;
                }

                if (check == 1) {
                    System.out.print("Enter customer name: ");
                    banking.setCustomerName(input.nextLine());
                    check++;
                }

                if (check == 2) {
                    System.out.print("Enter initial balance: ");
                    banking.setBalance(input.nextDouble());
                    check++;
                }

                if (check == 3) {
                    System.out.print("Enter deposit amount: ");
                    banking.deposit(input.nextDouble());
                    check++;
                }

                if (check == 4) {
                    System.out.print("Enter Withdraw amount: ");
                    banking.withdraw(input.nextDouble());
                }

                System.out.println(banking.toString());

                isValid = false;
            } catch (InputMismatchException e) {
                System.out.println(e);
            } 
                    
        }

    }

}
