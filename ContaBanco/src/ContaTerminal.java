import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o seu nome:");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();

       
        double saldo = 25;

    
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, " + nome + " " + sobrenome);
        System.out.println("Sua conta foi acessada com sucesso ");
        System.out.println("Sua conta é " + conta + " e agência " + agencia);
        System.out.println("Seu saldo é " + saldo + " reais, então não jogue no tigrinho, invista em ouro que vale mais do que dinheiro.");

    }
}
