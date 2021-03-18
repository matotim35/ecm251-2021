package ha.matheus;

public class ValidadorCPF {
    private static final String[] invalidosConhecidos = {
            "00000000000", "11111111111", "22222222222",
            "33333333333", "44444444444", "55555555555",
            "66666666666", "77777777777", "88888888888", "99999999999"
    };
    private static final int[] multiplicadorPrimeiroDigito={
            10, 9, 8, 7, 6, 5, 4, 3, 2
    };
    private static final int[] multiplicadorSegundoDigito={
            11,10, 9, 8, 7, 6, 5, 4, 3, 2
    };
    private static final int TAMANHO_CPF = 11;

    public static boolean validarCpf(String cpf){
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        //Valida se o tamanho do cpf esta de acordo com o esperado
        if(cpf.length() != 11)
            return false;

        //verifica se o cpf esta dentro dos invalidos conhecidos
        for (String cpfInvalido:
             invalidosConhecidos) {
            if (cpfInvalido.equals(cpf))
                return false;
        }

        //validacao do primeiro e do segundo digito
        if (validarDigito(multiplicadorPrimeiroDigito,cpf) && validarDigito(multiplicadorSegundoDigito, cpf))
            return true;





        return true;
    }
    private static boolean validarDigito(int[] multiplicadores, String cpf){
        int somatoria = 0;
        for (int i = 0; i < multiplicadores.length; i++) {
            somatoria += multiplicadores[i]*Integer.parseInt(""+ cpf.charAt(i));
        }
        return (""+ ((somatoria*10)%11)%10).equals(
                ""+ cpf.charAt(multiplicadores.length)
        );
    }
}
