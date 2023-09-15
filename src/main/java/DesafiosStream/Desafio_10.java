package DesafiosStream;

import java.util.Arrays;
import java.util.List;

public class Desafio_10 {
    public static void main(String[] args) {
        //Agrupe os valores ímpares múltiplos de 3 ou de 5

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       List<Integer> multiplos3 = numeros.stream().filter(n -> n % 3 == 0  ).toList();
      List<Integer> multiplos3Impar = multiplos3.stream().filter(n -> n % 2 != 0).toList();

        System.out.print("os multipos impares de tres são: " + multiplos3Impar);
    }
}
