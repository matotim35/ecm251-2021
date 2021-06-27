package ha.matheus.models;

import ha.matheus.enums.MemberRole;
import ha.matheus.enums.SystemTime;

public class BigBrother extends Member {
    public BigBrother(String usuario, String email) {
        super(usuario, email);
        this.role = MemberRole.BigBrothers;
        this.assinaturaRegular = "Sempre ajudando as pessoas membros ou não S2!";
        this.assinaturaExtra = "...";
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
