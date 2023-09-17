package DesafiosStream;

import java.util.Arrays;
import java.util.List;

public class Desafio_16 {
    public static void main(String[] args) {
        //Agrupe os números em pares e ímpares

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> par = numeros.stream().filter(n -> n % 2 == 0).distinct().toList();
        List<Integer> impar = numeros.stream().filter(n -> n % 2 != 0).distinct().toList();

        System.out.println("numeros pares da lista: " + par);
        System.out.println("Numeros Impares da lista: " + impar);
    }
}
