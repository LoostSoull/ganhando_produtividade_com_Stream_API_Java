package DesafiosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Desafio_2 {
    public static void main(String[] args) {
        // Imprima a soma dos números pares da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       /* Consumer<Integer> pares = n -> {if(n % 2 == 0){
            System.out.println(n);
        }};*/

        //numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);


        BinaryOperator<Integer> somar = Integer::sum;
       int resultado = numeros.stream().filter(n -> n % 2 == 0).reduce(0,somar);

        System.out.println(resultado);


    }
}
