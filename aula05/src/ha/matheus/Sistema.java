package ha.matheus;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;

    public void executar(){
        int opcao;
        while(executarSistema) {
            exibirMenu();
            opcao= scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao){
        switch (opcao){
            case 0:
                System.out.println("Obrigado por ecolher o MauaBank");
                this.executarSistema=false;
                break;
            default:
                System.out.println("Essa funcionalidade ainda nao foi implementada");

        }
    }

    public Sistema() {
        this.scanner = new Scanner(System.in); //Deixa ele ler da entrada do sistema- teclado
        this.executarSistema = true;
    }

    private void exibirMenu() {
        System.out.println("Bem Vindo ao MauaBank");
        System.out.println("1- Visualizar saldo");
        System.out.println("2- Sacar dinheiro");
        System.out.println("3- Depositar dinheiro");
        System.out.println("4- Transferir dinheiro");
        System.out.println("5- Pagar conta");
        System.out.println("0- Encerrar");
    }
}
