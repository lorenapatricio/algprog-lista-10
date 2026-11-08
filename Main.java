import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, cpf);
        pessoa.andar();
        pessoa.falar();

        Aluno aluno = new Aluno("2026001", "Informática");
        aluno.estudar();
        aluno.fazerProva();

        Professor professor = new Professor("Matemática", 4500);
        professor.ensinar();
        professor.corrigirProva();

        Escola escola = new Escola("Escola Brasil", "Rua Central");
        escola.abrir();
        escola.fechar();

        Turma turma = new Turma("T01", "3º Ano");
        turma.adicionarAluno();
        turma.iniciarAula();

        Disciplina disciplina = new Disciplina("Português", 80);
        disciplina.apresentarConteudo();
        disciplina.aplicarAtividade();

        Livro livro = new Livro("Java para Iniciantes", "João Silva");
        livro.abrir();
        livro.fechar();

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", 500);
        biblioteca.emprestarLivro();
        biblioteca.devolverLivro();

        Curso curso = new Curso("Programação Java", 120);
        curso.iniciarCurso();
        curso.concluirCurso();

        Funcionario funcionario = new Funcionario("Secretário", 2500);
        funcionario.trabalhar();
        funcionario.receberSalario();

        scanner.close();
    }
}