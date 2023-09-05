import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {

    /**
     * Ponto de entrada principal para o programa da conta bancária no terminal.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Bank Account Creation System");
        String accountName = getInput("Type your name: ");
        String branchNumber = getInput("Please, now type your branch number: ");
        int accountNumber = getIntInput("Account number: ");
        double accountBalance = getDoubleInput("What is the balance in your bank account? ");

        System.out.println("Hello, " + accountName + ", thank you for creating an account with our bank.");
        System.out.println("Your branch is " + branchNumber + ", account number: " + accountNumber +
                ", and your balance is " + accountBalance + ", which is now available for withdrawal.");
    }

    /**
     * Obtém uma entrada de string do usuário.
     *
     * @param prompt A mensagem a ser exibida como prompt.
     * @return A string inserida pelo usuário.
     */
    private static String getInput(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).next();
    }

    /**
     * Obtém uma entrada de número inteiro do usuário.
     *
     * @param prompt A mensagem a ser exibida como prompt.
     * @return O número inteiro inserido pelo usuário.
     */
    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).nextInt();
    }

    /**
     * Obtém uma entrada de número decimal do usuário.
     *
     * @param prompt A mensagem a ser exibida como prompt.
     * @return O número decimal inserido pelo usuário.
     */
    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).useLocale(Locale.US).nextDouble();
    }
}
