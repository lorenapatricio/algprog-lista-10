public class Disciplina {

    String nome;
    int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void apresentarConteudo() {
        System.out.println("Apresentando conteúdo da disciplina.");
    }

    public void aplicarAtividade() {
        System.out.println("Atividade aplicada.");
    }
}