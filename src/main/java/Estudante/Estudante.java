package Estudante;

import java.util.Date;

public class Estudante {
    String nome;

    int anoDeNascimento;

    double notaTotal;

    public int CalcularIdade(int anoAtual){
        return anoAtual - anoDeNascimento;
    }

    public Boolean estaAprovado(){
        return notaTotal >= 7;
    }
}
