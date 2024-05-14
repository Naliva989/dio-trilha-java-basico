import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagem "Por favor, digite o número da agência!"
        System.out.println("Por favor, digite o número da agência!");
        // Capturar os dados com Scanner
        String agencia = scanner.nextLine();

        // Exibir mensagem "Por favor, digite o número da conta!"
        System.out.println("Por favor, digite o número da conta!");
        // Capturar os dados com Scanner
        String numero = scanner.nextLine();

        // Exibir mensagem "Por favor, digite o seu nome completo!"
        System.out.println("Por favor, digite o seu nome completo!");
        // Capturar os dados com Scanner
        String nomeCliente = scanner.nextLine();

        // Exibir mensagem "Por favor, digite o valor depositado!"
        System.out.println("Por favor, digite o valor depositado!");
        // Capturar os dados com Scanner
        double saldo = scanner.nextDouble();

        // Exibir a mensagem "Olá {Nome do cliente}, obrigado por criar uma conta em nosso banco, sua agência é {agência}, conta {Número} e o seu saldo {Saldo} já está disponível para saque"
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque");

        // Fechar o scanner para liberar recursos
        scanner.close();
    }
}
