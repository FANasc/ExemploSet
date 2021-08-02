package one.innovation.digital;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/********************************************************************************
 *
 * Objetivo:  1) Criar um Set.
 *            2) Adicionar 5 números inteiros: 3, 88, 20, 44 e 3.
 *            3) Navegar no Set e exibir cada número no console.
 *            4) Remover o primeiro item do Set.
 *            5) Retornar o primeiro item da fila removendo o mesmo.
 *            6) Adicionar o novo número no Set: 23.
 *            7) Retornar o tamanho do Set.
 *            8) Verificar se o Set está vazio.
 * Autor   : Fernando Aguiar
 * Data    : 02.08.2021
 *
 ********************************************************************************/

public class Main {

    public static void main(String[] args) {

        // (1) Criar um Set.
        TreeSet<Integer> setNumeros = new TreeSet<>();

        // (2) Adicionar 5 números inteiros: 3, 88, 20, 44 e 3.
        setNumeros.add(3);
        setNumeros.add((88));
        setNumeros.add(20);
        setNumeros.add(44);
        setNumeros.add(3); // Obs.: Esse número é repetido e não será considerado.

        // (3) Navegar no Set e exibir cada número no console.
        Iterator<Integer> iterator = setNumeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // (4) Remover o primeiro item do Set.
        Integer primeiroNumero = setNumeros.pollFirst();

        // (5) Retornar o primeiro item da fila removendo o mesmo.
        System.out.println("O primeiro item da lista que é: " + setNumeros.pollFirst() + ", será removido!");

        // (6) Adicionar o novo número no Set: 23.
        setNumeros.add(23);

        // (7) Retornar o tamanho do Set.
        System.out.println("O tamanho do Set é: " + setNumeros.size());

        // (8) Verificar se o Set está vazio.
        if (setNumeros.isEmpty()) {
            System.out.println("O Set está vazio!");
        } else {
            System.out.println("O Set tem conteúdo!");
        }
    }
}
