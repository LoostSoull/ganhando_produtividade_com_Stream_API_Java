package DesafiosStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;

public class Desafio_5 {
    public static void main(String[] args) {
        //Calcule a média dos números maiores que 5
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble maiorQueCinco = numeros.stream().filter(n -> n > 5).mapToDouble(Integer::doubleValue).average();

        System.out.printf("A média para os maiores de 5 é : " + maiorQueCinco.getAsDouble());
    }
}
