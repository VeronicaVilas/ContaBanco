import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Por favor, agora digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();
        
        System.out.println("Qual valor vocÊ deseja depositar?");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}


