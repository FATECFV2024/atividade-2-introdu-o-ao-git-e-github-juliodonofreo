import java.util.Scanner;

public class App {
        //Comentário

    public static void run (){
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite seu rgm: ");
        String rgm = ler.next();

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();

        System.out.print("Digite a url do seu github: ");
        String github_url = ler.next();

        System.out.print("Digite a url do seu linkedin: ");
        String linkedin_url = ler.next();

        Aluno aluno = new Aluno(nome, rgm, idade, github_url, linkedin_url);

        System.out.println("Dados do aluno:");
        System.out.println(aluno);

        ler.close();
    }
    public static void main(String[] args) throws Exception {
        run();
    }
}
