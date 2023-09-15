package DesafiosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Desafio_8 {
    public static void main(String[] args) {
        //Somar os dígitos de todos os números da lista

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        int resultado = numeros.stream().reduce( 0,(num, num2)-> num + num2);

        System.out.println(resultado);
    }
}
