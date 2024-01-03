import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        String agencia;
        String cliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        cliente = scanner.next();

        System.out.println("Por favor, informe seu saldo: ");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco! Sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
