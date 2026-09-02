
/*# Questão 1: Cadastro e Análise de Notas com Array
Desenvolva um programa que solicite ao usuário a quantidade de alunos de uma turma e armazene as notas deles em um array de double. 
O programa deve calcular e exibir a média da turma, a maior nota, a menor nota e a quantidade de alunos aprovados, considerando média mínima igual a 6,0.
Utilize Scanner para a entrada, try/catch para tratar valores inválidos, conversão de tipos quando necessário e um laço for para percorrer o array. Use if/else para classificar os alunos como aprovados ou reprovados.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
 
public class ARRAY1 {
    public static void main(String[] args) {
        Scanner alunos = new Scanner(System.in);
        Scanner vlrNotas = new Scanner(System.in);
        int qtdAlunos = 0;
        double[] notas = null;
        double somaNota = 0;
        int aprovados = 0;
        double menorNota = 10;
        double maiorNota = 0;
       
        do {
            try {
 
                System.out.println("Quantos alunos tem na turma: ");
                qtdAlunos = alunos.nextInt();
                notas = new double[qtdAlunos];
 
            } catch (InputMismatchException e) {
   
                System.out.println("Valor invalido!");
                qtdAlunos = 0;
                alunos.nextLine();
            }
        } while (qtdAlunos == 0);
 
        for (int i = 0; i < qtdAlunos; i++) {
            double nota = 0;
            do {
                try {
 
                    System.out.println("Digite a nota do aluno " + (i + 1) + ": ");
                    nota = vlrNotas.nextDouble();
 
                    if (nota > 10 || nota < 0) {
                        System.out.println(
                                "Valor digitado é invalido. Digite uma nota maior que maior ou igual a 0 ou menor ou igual a 10");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Digite um número valido");
                    nota = -1;
                    vlrNotas.nextLine();
                }
 
            } while (nota > 10 || nota < 0);
            notas[i] = nota;
            somaNota = somaNota + notas[i];
 
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
           
            }
 
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
 
            if (notas[i] >= 6.0) {
                aprovados++;
            }
 
        }
 
        System.out.println(" \n *** RESULTADOS  *** \n");
        System.out.println("Média turma: " + somaNota / qtdAlunos);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Alunos aprovados: " + aprovados);
        alunos.close();
        vlrNotas.close();
    }
}