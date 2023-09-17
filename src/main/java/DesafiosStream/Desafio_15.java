package DesafiosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio_15 {
    public static void main(String[] args) {
        //Verifique se a lista contém pelo menos um número negativo

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,-1);

      boolean negativo =   numeros.stream().anyMatch(n -> n < 0);

        System.out.println("existem numeros negativos? " + negativo);
    }
}
