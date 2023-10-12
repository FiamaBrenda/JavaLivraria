import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class Livro {
    Scanner leitor = new Scanner(System.in);
    public String titulo;
    public float preco;
    public LocalDate dtLanc;
    public Autor autor;
    public ArrayList<Livro> listaLivro = new ArrayList<>();

    public void CadastrarLivros() {


        Autor novoAutor = new Autor();

        System.out.println("Digite o Titulo:");
        titulo = leitor.nextLine();

        System.out.println("Digite o Preco:");
        preco = leitor.nextFloat();

        System.out.println("Digite a data de lancamento: (dd/mm/aaaa)");
        dtLanc = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Digite o nome do autor");
        novoAutor.nome = leitor.next();

        System.out.println("Digite o local de nascimento do autor");
        novoAutor.localNasc = leitor.next();

        autor = novoAutor;

        listaLivro.add(this);

        System.out.println("Cadastrado com Sucesso");
    }

    public void ListarLivros() {

        if(listaLivro.size() > 0) {

            for (Livro Livros : listaLivro) {
                System.out.println("Nome: " + Livros.titulo);
                System.out.println("CPF: " + Livros.preco);
                System.out.println("Data de Nascimento: " + Livros.dtLanc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println("Endereço: " + Livros.autor.nome + "-" + Livros.autor.localNasc);
                System.out.println();
                System.out.println("Aperte ENTER para continuar");
                leitor.nextLine();
            }
        }else{

                System.out.println("Lista vazia!");
            }

    }
}
