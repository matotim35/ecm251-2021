package ha.matheus;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;
    private Conta conta;

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
            case 1:
                System.out.println("Saldo Atual: R$" + this.conta.getSaldo());
                break;
            case 2:
                System.out.println("Qual quantia de dinheiro?");
                double quantiaParaSacar= scanner.nextDouble();
                if(this.conta.sacar(quantiaParaSacar)){
                    System.out.println("Operação realzada com sucesso");
                } else {
                    System.out.println("Nao foi possivel realizar a operacao");
                }
            case 3:
                System.out.println("Qual quantia de dinheiro?");
                double quantiaParaDepositar= scanner.nextDouble();
                this.conta.depositar(quantiaParaDepositar);
                System.out.println("Opecao realizada com sucesso!");
                break;
            case 5:
                System.out.println("Nome da Conta:");
                String nome = scanner.next();
                System.out.println("Valor da conta:");
                double valorDaConta = scanner.nextDouble();
                System.out.println("Juros da conta:");
                double jurosDaConta = scanner.nextDouble();
                System.out.println("Informe a data de vencimento (ano-mes-dia)?");
                String dataVencimentoTitulo = scanner.next();
                Titulo titulo = new Titulo(valorDaConta,nome,dataVencimentoTitulo, jurosDaConta);
                if(this.conta.sacar(titulo.totalParaPagar())){
                    System.out.println("Operação Realizada com Sucesso!");
                } else {
                    System.out.println("Algo de errado aconteceu!");
                }
            default:
                System.out.println("Essa funcionalidade ainda nao foi implementada");

        }
    }

    public Sistema() {
        this.scanner = new Scanner(System.in); //Deixa ele ler da entrada do sistema- teclado
        this.executarSistema = true;
        this.conta = new Conta("Mario", 1945, 1234 );
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
