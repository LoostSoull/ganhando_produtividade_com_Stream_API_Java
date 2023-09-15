package DesafiosStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio_7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> copiaNumeros = numeros.stream().distinct().sorted(Comparator.reverseOrder()).toList();

        int segundoMaior = copiaNumeros.get(1);

        System.out.println("O segundo maior numero é: " + segundoMaior);
    }

}
