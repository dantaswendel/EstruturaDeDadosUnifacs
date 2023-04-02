package org.example;

import java.util.Scanner;

public class Atividade01 {

       public static void main(String[] args) {

            String[] alunos = new String[25];

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < alunos.length; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                alunos[i] = scanner.nextLine();
            }

            System.out.println("Alunos cadastrados:");
            for (String aluno : alunos) {
                System.out.println(aluno);
            }

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o nome do novo aluno " + (i + 1) + ": ");
                alunos[i + 25] = scanner.nextLine();
            }

            System.out.println("Alunos cadastrados atualizados:");
            for (String aluno : alunos) {
                System.out.println(aluno);
            }

            scanner.close();
        }
    }

