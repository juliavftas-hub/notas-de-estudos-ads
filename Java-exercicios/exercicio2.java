/*# Questão 2: Busca de Valores em um Array
Crie um programa que leia 10 números inteiros e armazene-os em um array.
Em seguida, solicite outro número ao usuário e informe se ele está presente no array. 
Caso esteja, exiba todas as posições em que foi encontrado; caso contrário, informe que o número não foi localizado.
O programa deve utilizar um laço for para preencher e percorrer o array. A entrada dos números deve ser protegida por try/catch, 
e a comparação deve ser realizada com operadores relacionais e if/else. */


import java.util.Scanner; // serve para ler o que o usuário digita
import java.util.InputMismatchException; // serve para ler erros de entrada

public class exercicio2 { // criando e dando nome a uma classe

    public static void main(String[] args) {
        Scanner notas =  new Scanner(System.in); // serve para capturar entradas do usuário
        Scanner alunos =  new Scanner(System.in);
        double[] valorNota = null;
        double soma = 0;
        double maior = 0;
        double menor = 10;
        int aprovados = 0;
        int nmrAlunos = 0;
        
        do {

            try{
            System.out.println("Quantos alunos tem na turma: ");
            nmrAlunos = alunos.nextInt();
            notas = new double[nmrAlunos];
            // Cria o array com a quantidade de alunos
            }
            catch(InputMismatchException e) {

                System.out.println(" Letras não são validas.");
                nmrAlunos = 0;
                nmrAlunos.next();
                
            }
        
        } while (alunos == 0);
        
        // Percorre cada aluno
        for (int i = 0; i < alunos; i++) {

            do {
                System.out.println("Digite a nota do aluno " + (i + 1) + ":");

                try {

                    notas[i] = entrada.nextDouble();
                    
                } catch (InputMismatchException e) {

                    System.out.println("Valor inválido!");

                    entrada.next();
                }

            } while (notas[i] > 10 || notas[i] < 0);
        }

        // percorrer o array para classificar as notas

        for (int i = 0; i < alunos; i++) {

            soma += notas[i];

            if (notas[i] >= 6) {
                System.out.println("Aluno " + (i + 1) + " Aprovado");
                aprovados++;
            } else {
                System.out.println("Aluno " + (i + 1) + " Reprovado");
            }

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        // Calcula a média
        double media = soma / alunos;

        // Exibe os resultados
        System.out.println(" \n *** RESULTADOS  *** \n");
        System.out.println("A média da turma é: " + media);
        System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);
        System.out.println("Quantidade de alunos aprovados: " + aprovados);

        entrada.close();
    }
}
