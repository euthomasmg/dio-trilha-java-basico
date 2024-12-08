import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int conta;
        double saldo = 12_000;
        String agencia, nome;

        System.out.print("Informe seu nome completo: ");
        nome = scanner.nextLine();

        System.out.print("Informe o número da sua conta: ");
        conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe a sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");





    }
}