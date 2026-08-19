import java.util.Scanner;
import java.util.InputMismatchException;


/* Desenvolva um programa em Java que leia dois números inteiros do usuário e exiba o resultado das operações
 basicas (adição, subtração, multiplicação, divisão e módulo). Utilize Scanner para entrada de dados e trate possíveis 
exceções com try/catch */

public class primeiro {
    public static void main(String[] args){
      
        // Entrada de Informação
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = entrada.nextInt();
 
        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        double div = 0;
        int mod = 0;

        try {
        div = a / b;
        mod = a % b;
        } catch (ArithmeticException e) {
        System.out.println ("Não existe divisão por 0"); 
        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + sub);
        System.out.println("A multiplicação dos valores é: " + mult);
        System.out.println("A divisão dos valores é: " + mult);
        System.out.println("O módulo dos valores é: " + mod);

        entrada.close();
    }
}