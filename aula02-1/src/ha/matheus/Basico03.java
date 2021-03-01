package ha.matheus;

import java.util.Random;

public class Basico03 {
    public static void main(String[] args) {
        //repeticao
        int limite = 10;
        int contador;
        for(contador=0; contador<limite; contador++){
            System.out.printf("Contador atual: " + contador);
        }

        //Cria um objeto que sorteia coisas aleatorias
        Random sorteador = new Random();
        int numero= sorteador.nextInt(1000);
        System.out.println("Numero sorteado: " + numero);

        int senha= 123456;
        int tentativas=0, chute;
        chute= sorteador.nextInt(999999);
        while(chute!=senha){
            tentativas++;
            System.out.println("Ainda nao quebramos: " + chute);
            System.out.println("Tentativa: " + tentativas);
            chute= sorteador.nextInt(999999);
        }
        System.out.println("Parabens! Levou apenas: " + tentativas);
    }
}
