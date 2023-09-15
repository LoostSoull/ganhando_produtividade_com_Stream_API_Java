package DesafiosStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio_6 {
    public static void main(String[] args) {
        //Verificar se a lista contém algum número maior que 10

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Criado Predicate dentro do anyMatch, ele valida se algum elemento atende ao predicate
        //lembrando que predicate aceita T  e retorna boolean

        boolean existe = numeros.stream().anyMatch(n -> n > 10);



        System.out.println(existe);


    }
}
