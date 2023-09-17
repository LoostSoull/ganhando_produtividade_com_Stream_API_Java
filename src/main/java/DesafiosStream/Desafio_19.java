package DesafiosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Desafio_19 {

    public static void main(String[] args) {
        //Encontre a soma dos números divisíveis por 3 e 5

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        //soma  numeros
        int teste = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).mapToInt(n -> n).sum();

        System.out.println(teste);
    }
}