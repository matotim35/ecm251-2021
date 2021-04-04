package ha.matheus;

public class Contas {
    private int idConta;
    private double saldo;
    private int TotalContas;
    private Usuario usuario;

    public Contas(int idConta, Usuario usuario, double saldoInicial){
        this.idConta= idConta;
        this.usuario= usuario;
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

    public String getUsuarioNome(){
        return usuario.getNome();
    }
}
