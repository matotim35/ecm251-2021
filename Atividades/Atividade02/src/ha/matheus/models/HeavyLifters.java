package ha.matheus.models;

import ha.matheus.enums.MemberRole;
import ha.matheus.enums.SystemTime;

public class HeavyLifters extends Member {
    public HeavyLifters(String usuario, String email) {
        super(usuario, email);
        this.role = MemberRole.HeavyLifters;
        this.assinaturaRegular = "Podem contar conosco!";
        this.assinaturaExtra = "N00b_qu3_n_Se_r3pita.bat";
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
