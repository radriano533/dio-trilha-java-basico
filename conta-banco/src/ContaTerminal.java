import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To Do: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter pela classe Scanner os valores digitados no terminal
        // Exibir a mensagem da conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da Conta");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite valor para depósito");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá, "+ nome +" "+ sobrenome +" obrigado por criar uma conta em nosso banco,sua agência é a " + agencia + ", conta número "+ conta + " e seu saldo de R$ "+ saldo +" está disponível para saque");
       
    }
}
