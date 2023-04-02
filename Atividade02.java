package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Atividade02 {
        public static void main(String[] args) {
            ArrayList<Integer> lista = new ArrayList<>();
            Stack<Integer> pilha = new Stack<>();
            Queue<Integer> fila = new LinkedList<>();

            lista.add(1);
            lista.add(2);
            lista.add(3);
            lista.add(4);
            lista.add(5);

            while (!lista.isEmpty()) {
                int valor = lista.remove(0);
                pilha.push(valor);
            }

            while (!pilha.isEmpty()) {
                int valor = pilha.pop();
                fila.add(valor);
            }

            lista.add(6);
            lista.add(7);
            lista.add(8);
            lista.add(9);
            lista.add(10);

            while (!lista.isEmpty()) {
                int valor = lista.remove(0);
                pilha.push(valor);
            }

            while (!pilha.isEmpty()) {
                int valor = pilha.pop();
                fila.add(valor);
            }

            System.out.println("Números inseridos na Fila:");
            while (!fila.isEmpty()) {
                int valor = fila.poll();
                System.out.println(valor);
            }
        }
    }

