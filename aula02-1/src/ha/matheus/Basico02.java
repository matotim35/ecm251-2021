package ha.matheus;

public class Basico02 {
    public static void main(String[] args) {
        //estrutura de decisao no Java
        int poderDeLuta=  8000;

        if(poderDeLuta >= 8000) {
            System.out.println("Kakaroto");
        }
        if(poderDeLuta > 10000){
            System.out.println("Pode ser super saiyan");
        } else {
            System.out.println("Pode ser o kuririn");

        }

        int morreu = 5;
        if (morreu == 0){
            System.out.println("Voce é uma pessoa normal");

        } else if(morreu<3){
            System.out.println("Vc eh um guerreiro");
        } else if(morreu<8){
            System.out.println("Vc é um saiyajin");
        } else {
                System.out.println("Bem vindo de volta");
        }

        //decisao multipla switch
        switch (morreu){
            case 0:
                System.out.println("Ola mundo");
                break;
            case 10:
                System.out.println("Vixi");
                break;
            default:
                System.out.println("É nois");
                break;


        }
    }
}
