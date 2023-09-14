package DesafiosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio_3 {
    public static void main(String[] args) {
        //Verifique se todos os números da lista são positivos

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,-1);

        /*maneira completa
        Predicate<Integer> numerosPositivos = n -> n > 0;
       List<Integer> numerosPositivosList =  numeros.stream().filter(numerosPositivos).toList();*/

        List<Integer> numerosPositivosList = numeros.stream().filter(n -> n > 0).toList();
        System.out.println("Os numeros positivos são: " + numerosPositivosList);
    }
}
