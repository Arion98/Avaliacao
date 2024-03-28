package Pet;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Pet pet = new Pet();
        Scanner leia = new Scanner(System.in);
        System.out.println("digite o nome do animal:");
        String nome = leia.nextLine();
        System.out.println("digite a espécie do animal:");
        String especie = leia.nextLine();
        System.out.println("digite a idade do animal:");
        int idade = leia.nextInt();
        pet.mostrarDadosDoPet(nome,especie, idade );
    }

}
