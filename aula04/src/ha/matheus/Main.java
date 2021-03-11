package ha.matheus;

public class Main {

    public static void main(String[] args) {
        //Cria um objeto do tipo Conta
        Conta c1;
        //Instancia um objeto conta
        c1 = new Conta();

        c1.depositar(300);
        c1.sacar(250);
        c1.visualizarSaldo();
    }
}
