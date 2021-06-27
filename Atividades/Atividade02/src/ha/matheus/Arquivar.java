package ha.matheus;

import ha.matheus.models.Member;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivar {
    public void arquivar(ArrayList<Member> list) throws FileNotFoundException{
        File arquivo = new File("arquivo_super_secreto_nao_pode_abrir.csv");

        try {
            PrintWriter out = null;

            out = new PrintWriter(arquivo);

            out.print("Nome");
            out.print(";");
            out.print("Email");
            out.print(";");
            out.println("Funcao");

            PrintWriter finalOut = out;
            list.forEach(member -> {

                finalOut.print(Member.getUsuario());
                finalOut.print(";");
                finalOut.print(Member.getEmail());
                finalOut.print(";");
                finalOut.println(Member.getRole());

            });
            out.close();
    } catch (FileNotFoundException e){
            e.printStackTrace();
        }
}}
