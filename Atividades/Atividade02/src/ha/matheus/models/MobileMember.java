package ha.matheus.models;

import ha.matheus.enums.MemberRole;
import ha.matheus.enums.SystemTime;

public class MobileMember extends Member {
    public MobileMember(String usuario, String email) {
        super(usuario, email);
        this.role = MemberRole.MobileMember;
        this.assinaturaRegular = "Happy Coding!";
        this.assinaturaExtra = "Happy_C0d1ng.Maskers";
    }

    /**
     * @param mensagem
     * Imprimir assinatura do cargo dependendo da hora
     */
    @Override
    public void postarMensagem(String mensagem, SystemTime time) {
        if(time.equals(SystemTime.Regular)){
            System.out.println(this.assinaturaRegular);
        } else {
            System.out.println(this.assinaturaExtra);
        }
    }
}