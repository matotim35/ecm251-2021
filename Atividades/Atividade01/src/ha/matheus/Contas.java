package ha.matheus;

public class Contas {
    private int idConta;
    private double saldo;
    private int TotalContas=0;

    public Contas(int idConta, double saldoInicial){
        this.idConta= idConta;
        this.saldo= saldoInicial;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }


    public int getIdConta() {
        return idConta;
    }

    public double getSaldo() {
        return saldo;
    }


}
