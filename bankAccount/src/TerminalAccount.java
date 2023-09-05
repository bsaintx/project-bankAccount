import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {

    /**
     * Ponto de entrada principal para o programa da conta bancária no terminal.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Sistema de Criação de Conta Bancária");
        String nomeDaConta = getInput("Digite seu nome: ");
        String numeroDaAgencia = getInput("Por favor, digite o número da sua agência: ");
        int numeroDaConta = getIntInput("Número da conta: ");
        double saldoDaConta = getDoubleInput("Qual é o saldo da sua conta bancária? ");

        System.out.println("Olá, " + nomeDaConta + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroDaAgencia + ", número da conta: " + numeroDaConta +
                ", e seu saldo é " + saldoDaConta + ", que agora está disponível para saque.");
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
