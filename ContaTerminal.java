import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: conhecer e importar a classe Scanner 
             Scanner scanner = new Scanner(System.in);

         //Exibir as mensagens para o nosso usuário 
           

            System.out.print("Por favor, informe o número da Conta: ");
            int Numero = scanner.nextInt();
            scanner.nextLine();  
            
            System.out.print("Por favor, informe o número da Agência: ");
            String Agencia = scanner.nextLine();

            System.out.print("Por favor, informe  o nome do Cliente: ");
            String NomeCliente = scanner.nextLine();

            System.out.print("Por favor, informe  o saldo: ");
            double Saldo = scanner.nextDouble();

         //Exibir a mensagem conta criada
        String mensagem = "Olá ".concat(NomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(Agencia)
                .concat(", conta ")
                .concat(String.valueOf(Numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(Saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}



