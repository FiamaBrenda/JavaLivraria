import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Livro metodoLivro = new Livro();
        

        System.out.println("Bem vindo ao sistema da Livraria");

        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {

            System.out.println("Escolha uma opção: 1 - Cadastrar Livros / 2 - Listar livros / 0 - Sair");
            opcao = leitor.nextLine();

            switch (opcao){
                case "1":

                    metodoLivro.CadastrarLivros();

                    break;

                case "2":


                    metodoLivro.ListarLivros();


                    break;

                case "0":
                    System.out.println("Volta");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(!opcao.equals("0"));
    }
}