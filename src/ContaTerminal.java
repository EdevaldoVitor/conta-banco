import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String agencia;
        String nomeCliente;
        int numero;
        double saldo;

        Scanner input = new Scanner(System.in);

        System.out.print("Por favor, Digite o seu nome:");
        nomeCliente = input.next();
        System.out.print("Por favor, Digite o numero da conta: ");
        numero = input.nextInt();
        System.out.print("Por favor, Digite o numero da agência: ");
        agencia = input.next();
        System.out.print("Por favor, Digite o saldo do conta: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " " +
                "e seu saldo " + saldo + " já está disponível para saque.");

    }
}