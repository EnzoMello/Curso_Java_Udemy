package Bank_Exercise.application;

import Bank_Exercise.entities.Account;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        // CONFIGURAÇÕES INICIAIS E INSTÂNCIA DA CLASSE ACCOUNT
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        // PARÂMETROS QUE SERÃO USADOS NA QUESTÃO
        System.out.println("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            account = new Account(numberAccount, name, depositValue);
        }
        else {
            account = new Account(numberAccount, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        account.deposit(newDeposit);
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawDeposit = sc.nextDouble();
        account.withdraw(withdrawDeposit);
        System.out.println(account);

        sc.close();
    }
}
