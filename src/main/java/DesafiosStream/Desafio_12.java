package DesafiosStream;

import java.util.Arrays;
import java.util.List;

public class Desafio_12 {
    public static void main(String[] args) {
        //Encontre o produto de todos os números da lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produto = numeros.stream().reduce(1, (n, n2) -> n * n2);

        System.out.println(produto);
    }

}