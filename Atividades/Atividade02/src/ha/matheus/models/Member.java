package ha.matheus.models;

import ha.matheus.enums.MemberRole;
import ha.matheus.interfaces.Apresentacao;
import ha.matheus.interfaces.PostarMensagem;

public abstract class Member implements Apresentacao, PostarMensagem {

    public static String usuario;
    public static String email;
    public static MemberRole role;
    protected String assinaturaRegular;
    protected String assinaturaExtra;


    public Member(String usuario, String email){
        this.usuario = usuario;
        this.email = email;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static String getEmail() {
        return email;
    }

    public static MemberRole getRole() {
        return role;
    }



    @Override
    public void apresentarMembros() {
        System.out.println("Nome: "+ this.getUsuario() + "\nEmail: "+ this.getEmail() + "\nCargo: " + this.getRole() + "\n");

    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Member{" +
                "usuario='" + usuario + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
