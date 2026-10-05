import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class vendaProdutos {
    public static void main (String[] args) {
        scanner s = new Scanner (System.in);
        ArrayList<produtos> produto = new ArrayList<>();
        int opt = -1;

        do{
            System.out.println("===PRODUTOS===");
            System.out.println("0. Sair");
            System.out.println("1. Adicionar Produto no Estoque");
            System.out.println("2. Remover Produto do Estoque");
            System.out.println("3. Calcular Valor do Estoque");
            System.out.println("4. Exibir Dados");
            System.out.println("Digite a Operação");
            opt = buscarOperacao;
            switch (opt) {
                case 0:
                    System.out.println("Adeus!")
            
                    break;
                
                    case 1:

                 System.out.println("Digite o nome do produto");
                 string nome = s.next ();
                 System.out.println("Digite o preço do produto");
                 double preço = s.next ();
                 System.out.println("Digite a quantidade do produto");
                 int quantidade = s.next ();

                 )   

            }

        }
    


    }
}
