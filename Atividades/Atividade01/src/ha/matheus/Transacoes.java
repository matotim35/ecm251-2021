package ha.matheus;

import java.security.KeyStore;
import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    //Ajuda do GUILHERME JUN
    public static String gerarQRCode(double valor, Contas conta){
        int idConta= conta.getIdConta();
        String nome= conta.getUsuarioNome();
        int QRtransacao= getRandomNumberInRange(1000,9999);
        return idConta + ";" + nome + ";" + valor + ";" + QRtransacao;
    }

    public static void pagamento(String QRcode, Contas pagador, Contas recebedor){
        String[] dados= QRcode.split(";");

        int IDrecebedor= Integer.parseInt(dados[0]);
        String nome= dados[1];
        double valor= Double.parseDouble(dados[2]);
        int QRtransacao= Integer.parseInt(dados[3]);

        if(valor <= pagador.getSaldo()){
            boolean sacar= pagador.sacar(valor);
            recebedor.depositar(valor);
        }

    }


}
