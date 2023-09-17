package DesafiosStream;

import java.util.Arrays;
import java.util.List;

public class Desafio_17 {
    public static void main(String[] args) {
        //Filtrar os números primos da lista

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> {
                    if (Math.abs(n) < 2)
                        return false;
                    for (int i = 2; i < Math.abs(n); i++) {
                        if (Math.abs(n) % i == 0)
                            return false;
                    }
                    return true;
                })
                .toList();
        System.out.println("A lista dos números primos é: " + numerosPrimos);
    }
    }

