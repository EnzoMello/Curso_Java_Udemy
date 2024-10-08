package memberEstatic_Exercise.application;

import memberEstatic_Exercise.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dolar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double quantidade = sc.nextDouble();
        double conversao = CurrencyConverter.converter(dolar,quantidade);
        System.out.printf("Amount to be paid in reais = %.2f%n",conversao);

        sc.close();
    }

}
