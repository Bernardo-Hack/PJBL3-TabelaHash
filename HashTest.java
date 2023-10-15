public class HashTest {
    public static void main(String[] args) {
        MyHashTable<Aluno> hash1 = new MyHashTable<>(7);
        MyHashTableEx<Aluno> hash2 = new MyHashTableEx<>(7);
        Aluno[] alunos1 = criarAlunos();

        
        for (Aluno aluno : alunos1) {
            hash1.insert(aluno.getMatricula(), aluno);
        }

        for (Aluno aluno : alunos1) {
            hash1.insert(aluno.getMatricula(), aluno);
        }
        
        System.out.println("Hash 1");
        hash1.print();
        System.out.println("Quantidade de itens: " + hash1.getQuantItems());
        
        for (Aluno aluno : alunos1) {
            hash2.insert(aluno.getMatricula(), aluno);
        }

        for (Aluno aluno : alunos1) {
            hash2.insert(aluno.getMatricula(), aluno);
        }

        System.out.println("\n Hash 2");
        hash2.print();
        System.out.println("Quantidade de itens: " + hash2.getQuantItems());


        //buscando no hash 1
        long startHash1 = System.currentTimeMillis();

        hash1.search(123456); 
        hash1.search(456789);
        hash1.search(789012);
        hash1.search(398244);
        hash1.search(398244);
        

        long finishHash1 = System.currentTimeMillis();
        long totalHash1 = finishHash1 - startHash1;
        System.out.println("Tempo: " + totalHash1);

        //buscando no hash 2
        long startHash2 = System.currentTimeMillis();

        hash2.search(123456); 
        hash2.search(456789);
        hash2.search(789012);
        hash2.search(398244);
        hash2.search(398244);

        long finishHash2 = System.currentTimeMillis();
        long totalHash2 = finishHash2 - startHash2;
        System.out.println("Tempo: " + totalHash2);

        if(totalHash1 < totalHash2){
            System.out.println("O primeiro tipo de Hash (joga pro proximo) é mais eficiente!!");
        }else{
            System.out.println("O segundo tipo de Hash (joga na lista) é mais eficiente!!");
        }

        
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
