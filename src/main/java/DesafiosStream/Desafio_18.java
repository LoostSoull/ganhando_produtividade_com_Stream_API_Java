package DesafiosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio_18 {
    public static void main(String[] args) {
        //Verifique se todos os números da lista são iguais

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



        List<Integer> numerosDistintos = numeros.stream().distinct().toList();
        boolean saoIguais = numerosDistintos.size() == numeros.size();

        System.out.println("todos os numeros da lista sao iguais? " + saoIguais);


    }
}
