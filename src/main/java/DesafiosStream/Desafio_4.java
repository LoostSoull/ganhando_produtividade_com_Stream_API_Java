package DesafiosStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafio_4 {
    public static void main(String[] args) {
        //Remova todos os valores ímpares


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Predicate<Integer> removeImpar = n -> n % 2 != 0;
        //quando você inicia uma List com o Arrays.asList() você cria uma lista que não pode ser modificada.
        //dessa forma, foi criada uma nova lista, contendo os valores da original e aplicando o predicate nela.
        List<Integer> numerosPares = new ArrayList<>(numeros);

        numerosPares.removeIf( numero -> numero % 2 != 0);
        System.out.println(numerosPares);
    }
}
