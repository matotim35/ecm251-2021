package ha.matheus;

public class Conta {
    //Atributos da classe
    private Cliente cliente;
    private double saldo;
    private int numero;

    //Método da classe
    public void depositar(double valor) {
        //this.saldo= this.saldo + valor;
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo-= valor;
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

    public double visualizarSaldo() {
        return this.saldo;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
