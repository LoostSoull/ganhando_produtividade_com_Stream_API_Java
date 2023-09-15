package DesafiosStream;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio_9 {

    public static void main(String[] args) {
        //Verificar se todos os números da lista são distintos (não se repetem)
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

      List<Integer> numerosDiferentes = numeros.stream().distinct().toList();

      boolean distintos = numeros.size() == numerosDiferentes.size();

        System.out.println("Os numeros sao distintos? : " + distintos);



    }

}
