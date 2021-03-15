package ha.matheus;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;


public class Titulo {
    private double valor;
    private String descricao;
    //para guardar dados de data
    private LocalDate dataDeVencimento;
    private double JurosAoDia;


    public Titulo(double valor, String descricao, LocalDate dataDeVencimento, double jurosAoDia) {
        this.valor = valor;
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.JurosAoDia = jurosAoDia;
    }

    public double totalParaPagar(){
        if(!estaAtrasada()){
            return this.valor;
        } else {
            return calcularJuros();
        }
    }

    private double calcularJuros() {
        return this.valor + this.valor*this.JurosAoDia * dataDeVencimento.until(LocalDate)
    }

    private boolean estaAtrasada() {
        return LocalDate.now().isAfter(dataDeVencimento);
    }
}
