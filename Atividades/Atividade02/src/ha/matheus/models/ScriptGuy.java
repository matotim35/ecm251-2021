package ha.matheus.models;

import ha.matheus.enums.MemberRole;
import ha.matheus.enums.SystemTime;

public class ScriptGuy extends Member {
    public ScriptGuy(String usuario, String email) {
        super(usuario, email);
        this.role = MemberRole.ScriptGuys;
        this.assinaturaRegular = "Prazer em ajudar novos amigos de código!";
        this.assinaturaExtra = "QU3Ro_S3us_r3curs0s.py";
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