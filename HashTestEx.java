public class HashTestEx {
    public static void main(String[] args) {
        MyHashTableEx<Aluno> table1 = new MyHashTableEx<>(7);
        Aluno[] alunos1 = criarAlunos();

        for (Aluno aluno : alunos1) {
            table1.insert(aluno.getMatricula(), aluno);
        }

        table1.print();
        System.out.println("");

        for (Aluno aluno : alunos1) {
            table1.insert(aluno.getMatricula(), aluno);
        }

        table1.print();
        System.out.println(table1.search(alunos1[0].getMatricula()));
        System.out.println(table1.getQuantItems());
    }

    static Aluno[] criarAlunos() {
        Aluno[] alunos = new Aluno[5];
        alunos[0] = new Aluno(123456, "FDE45", "João");
        alunos[1] = new Aluno(456789, "T5JU7", "Gabriel");
        alunos[2] = new Aluno(789012, "LKO10", "Maria");
        alunos[3] = new Aluno(398244, "FDE45", "Ana");
        alunos[4] = new Aluno(398244, "FDE45", "Ana");

        return alunos;
    }
}
