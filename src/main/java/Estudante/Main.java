package Estudante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Scanner leia = new Scanner(System.in);
        estudante.nome = "Jesli";
        estudante.anoDeNascimento = 1998;
        System.out.println("Idade: " + estudante.CalcularIdade(2024));
        System.out.println("Aprovado: " + estudante.estaAprovado());
    }

}
