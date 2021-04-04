package ha.matheus;
//O codigo foi teve muita inspiracao da nossa aula 05. O codigo com classe "Sistema", "Conta", etc.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do usuario 1: ");
        String nome1= scanner.nextLine();
        System.out.println("Informe o nome do usuario 2: ");
        String nome2= scanner.nextLine();
        System.out.println("Informe o nome do usuario 3: ");
        String nome3= scanner.nextLine();


        Usuario u1= new Usuario(nome1, "All.might@gmail.com","allmight123", "38929812383");
        Usuario u2= new Usuario(nome2, "One.for.all@gmail.com","oneforall123", "38629826522");
        Usuario u3= new Usuario(nome3, "Bakugo@gmail.com","bakugo123", "43129816523");


        Contas c1= new Contas(1, u1,1000);
        Contas c2= new Contas(2, u2,250);
        Contas c3= new Contas(3, u3,3000);

        System.out.println("\nEstado Inicial:");
        System.out.println(c1.getIdConta() + ": " + c1.getUsuarioNome() + " - \tSaldo: " +c1.getSaldo());
        System.out.println(c2.getIdConta() + ": " + c2.getUsuarioNome() + " - \tSaldo: " +c2.getSaldo());
        System.out.println(c3.getIdConta() + ": " + c3.getUsuarioNome() + " - \tSaldo: " +c3.getSaldo());

        String QR1= Transacoes.gerarQRCode(250, c1);
        Transacoes.pagamento(QR1, c2, c1);
        Transacoes.pagamento(QR1, c3, c1);
        Transacoes.pagamento(QR1, c2, c1);

        String QR2= Transacoes.gerarQRCode(1000, c2);
        Transacoes.pagamento(QR2, c3, c2);

        System.out.println("\nEstado Final:");
        System.out.println(c1.getIdConta() + ": " + c1.getUsuarioNome() + " - \tSaldo: " +c1.getSaldo());
        System.out.println(c2.getIdConta() + ": " + c2.getUsuarioNome() + " - \tSaldo: " +c2.getSaldo());
        System.out.println(c3.getIdConta() + ": " + c3.getUsuarioNome() + " - \tSaldo: " +c3.getSaldo());


    }
}
