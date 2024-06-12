import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
       
// INFORMAÇÕES
        Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu Nome Completo.");
        String nome = scanner.next();


        System.out.println("Por favor, digite seu Saldo");
        int saldo = scanner.nextInt();

// DADOS OBTIDOS

        System.out.println("Olá " + nome + ", seja bem vindo(a)!");
        System.out.println("O número da sua conta é: " + numero);
        System.out.println("O número da sua agência é: " + agencia);
        System.out.println("Seu saldo é de: " + saldo);
        System.out.println("Agradecemos seu contato! ");
    
        
    }
}
