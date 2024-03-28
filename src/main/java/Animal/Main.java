package Animal;

import java.util.Scanner;

import Pet.Pet;

public class Main {
    public static  void main(String[] args){
        Animal animal = new Animal();
        Scanner leia = new Scanner(System.in);
        System.out.println("digite o nome do animal:");
        String nome = leia.next();
        System.out.println("digite o tipo do animal:");
        String tipo = leia.next();
        System.out.println("digite o som do animal:");
        String som = leia.next();
        animal.emitirSom(nome,tipo,som);
    }
}
