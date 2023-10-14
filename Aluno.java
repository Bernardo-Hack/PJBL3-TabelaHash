public class Aluno {
    private int matricula;
    private String codCarteirinha;
    private String nome;

    public Aluno(int matricula, String codCarteirinha, String nome) {
        this.matricula = matricula;
        this.codCarteirinha = codCarteirinha;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCodCarteirinha() {
        return codCarteirinha;
    }

    public String getNome() {
        return nome;
    }
}
