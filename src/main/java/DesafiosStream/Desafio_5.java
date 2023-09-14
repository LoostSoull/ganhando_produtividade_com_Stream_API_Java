package DesafiosStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio_5 {
    public static void main(String[] args) {
        //Calcule a média dos números maiores que 5
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //BinaryOperator<Integer> soma = (numero,numero2) -> numero + numero2;

        int resultado = numeros.stream().filter(numero -> numero > 5).reduce(0, (numero,numero2) -> numero + numero2);
        System.out.println(resultado);
    }
}
