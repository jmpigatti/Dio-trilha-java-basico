import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);

        System.out.println("Por favor, digite um numero da sua Conta:");
        int numero = texto.nextInt();

        System.out.println("Por favor, digite o numero da sua agencia: ");
        String agencia = texto.next();

        System.out.println("Por favor, digite o seu nome inteiro: ");
        String nome = texto.next();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo = texto.nextDouble();

        System.out.println ("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia + ", conta " + numero + " e o seu saldo de " + saldo + " já está disponivel para saque." );
     
        texto.close();
    
}
}
