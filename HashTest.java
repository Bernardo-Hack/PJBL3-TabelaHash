public class HashTest {
    public static void main(String[] args) {
        MyHashTable<Aluno> table1 = new MyHashTable<>(7);
        Aluno[] alunos1 = criarAlunos();

        for (Aluno aluno : alunos1) {
            table1.insert(aluno.getMatricula(), aluno);
        }

        table1.delete(398244);
        System.out.println(table1.search(398244));
        table1.print();
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
