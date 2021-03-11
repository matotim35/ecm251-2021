package ha.matheus;

public class Conta {
    //Atributos da classe
    private Cliente cliente;
    private double saldo_disponivel;
    private int numero;

    //Método da classe


    //Construtor de classe
    public Conta(String nomeCliente, double saldoInicial){
        this.saldo_disponivel= saldoInicial;


    }

    public double getSaldo(){
        return this.saldo_disponivel;
    }

    public void depositar(double valor) {
        //this.saldo= this.saldo + valor;
        this.saldo_disponivel += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo_disponivel){
            this.saldo_disponivel-= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo_disponivel);

    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo_disponivel +
                ", numero=" + numero +
                '}';
    }
}
