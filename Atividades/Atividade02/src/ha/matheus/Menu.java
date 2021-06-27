package ha.matheus;

import ha.matheus.enums.SystemTime;
import ha.matheus.interfaces.Apresentacao;
import ha.matheus.models.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu implements Apresentacao {

    private static ArrayList<Member> memberList = new ArrayList<>();
    private static SystemTime sTime= SystemTime.Regular;

    public static void trocarSystemTime(){
        if (sTime.equals(SystemTime.Regular)) {
            sTime = SystemTime.Extra;
        } else {
            sTime = SystemTime.Regular;
        }
    }

    public static String getSystemTime(){
        if (sTime.equals(SystemTime.Regular)) {
            return "Regular";
        } else {
            return "Extra";
        }
    }


    public static void run(){
        boolean controlador = true;
        int opcao;
        while(controlador){
            Scanner scanner = new Scanner(System.in);
            System.out.println("=======================================================================================================================");
            System.out.println("=======================================================================================================================");
            System.out.println("============================================== MAsK_S0c13ty ===========================================================");
            System.out.println("=======================================================================================================================");
            System.out.println("\n1- Cadastrar \n2- Ver membros \n3- Remover membros \n4- Postar mensagem\n5- Trocar hora de trabalho \n0- Sair");
            System.out.printf("Hora de trabalho: %s", getSystemTime() + "\n");
            System.out.println("Opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 0:
                    //Sai do loop while
                    controlador = false;
                    break;
                case 1:
                    //Cadastrar membro
                    System.out.println("Nome: ");
                    String nome= scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("\nEscolha o cargo:\n1- Mobile Member\n2- Heavy Lifter\n3- Script Guys\n4- Big Brothers\n");
                    int role = scanner.nextInt();
                    scanner.nextLine();
                    switch(role){
                        case 1:
                            memberList.add(new MobileMember(nome, email));
                            break;
                        case 2:
                            memberList.add(new HeavyLifters(nome, email));
                            break;
                        case 3:
                            memberList.add(new ScriptGuy(nome, email));
                            break;
                        case 4:
                            memberList.add(new BigBrother(nome, email));
                            break;
                        default:
                            break;
                    }

                case 2:
                    //Ver membros
                    int id = 0;
                    for(Member member: memberList){
                        System.out.println("ID: "+ id);
                        member.apresentarMembros();
                        id= id+1;
                    }
                    break;

                case 3:
                    //Remover membros
                    System.out.println("Qual membro deseja retirar? Digite o ID: ");
                    int retirar = scanner.nextInt();
                    scanner.nextLine();
                    memberList.remove(retirar);
                    break;

                case 4:
                    //Imprimir assinaturas de todos os membros
                    for (Member member : memberList) {
                        member.postarMensagem("", sTime);
                        System.out.println();
                    }
                    break;

                case 5:
                    //Troca a hora de trabalho Regular-Extra
                    trocarSystemTime();
                    break;

                default:
                    break;
            }
        }
    }
}
