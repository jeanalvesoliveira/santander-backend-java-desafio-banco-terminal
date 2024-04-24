import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // instanciando um objeto do tipo Scanner
        Scanner scanner = new Scanner(System.in);

        // solicitação das informações
        // número da agência
        System.out.println("Por favor, digite o número da Agência!");
        numero = scanner.nextInt();
        // escape do nextInt
        scanner.nextLine();

        // código da agência
        System.out.println("Agora digite o código da Agência!");
        agencia = scanner.nextLine();

        // nome do cliente
        System.out.println("Digite o seu nome.");
        nomeCliente = scanner.nextLine();

        // saldo da conta
        System.out.println("Digite o saldo da conta.");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        // exibindo a mensagem final
        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque.");

        // fechando o scanner
        scanner.close();
    }
}
