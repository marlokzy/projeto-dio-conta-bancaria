import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("-----------------------------");
        System.out.println("Crie já sua conta no banco!");
        System.out.println("-----------------------------");

        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // input - entrada
        System.out.println("Por favor, digite o número da conta!");
        int numConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        String numAgencia = scanner.next();

        System.out.println("Por favor, digite o nome!");
        String nome = scanner.next();

        System.out.println("Agora seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o saldo desejado na conta!");
        double saldo = scanner.nextDouble();

        // output - saída
        System.out.println("Olá "+nome+" "+sobrenome+", obrigado por criar uma conta em nosso banco, sua agência é "+numAgencia+", conta "+numConta+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}
