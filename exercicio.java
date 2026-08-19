import java.util.Scanner;

/*# Questão 1: Cadastro e Análise de Notas com Array
Desenvolva um programa que solicite ao usuário a quantidade de alunos de uma turma e armazene as notas deles em um array de double. 
O programa deve calcular e exibir a média da turma, a maior nota, a menor nota e a quantidade de alunos aprovados, considerando média mínima igual a 6,0.
Utilize Scanner para a entrada, try/catch para tratar valores inválidos, conversão de tipos quando necessário e um laço for para percorrer o array. Use if/else para classificar os alunos como aprovados ou reprovados.
 */

public class exercicio {
public static void main(String[] args)
      
        // Entrada de Informação
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma: ");
        int alunos = entrada.nextInt();

        try {
        double[] notas = new double[alunos];
        
        for (int i = 0; i < alunos; i++) {
        System.out.println("Digite a nota do aluno " + (i + 1) + ": ");

        try {
        notas[i] = entrada.nextDouble();

        } catch (InputMismatchException e) {
        System.out.println("Valor inválido! Considerando nota 0");
        notas[i] = 0;
        entrada.next();
        
        
        entrada.close();
}
