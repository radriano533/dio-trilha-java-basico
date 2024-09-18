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
        String agencia = scanner.next();

       
    }
}
