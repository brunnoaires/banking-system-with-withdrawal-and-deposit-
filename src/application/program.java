package application;

//sempre importar as bibiliotecas scanner e locale
import java.util.Locale;
import java.util.Scanner;

import entitites.entities;

public class program {
    //sempre definiar o public static void e setar o locale
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        entities entities;

        System.out.print("Enter account number: ");
        int numc = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            entities = new entities(numc, holder, initialDeposit);
        }
        else {
            entities = new entities(numc, holder);
        }
        System.out.println();
        System.out.println("_____Account data_____");
        System.out.println(entities);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        entities.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(entities);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        entities.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(entities);

        sc.close();
    }
}