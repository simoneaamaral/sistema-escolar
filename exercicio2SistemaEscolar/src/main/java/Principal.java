public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 =  new Aluno();
        aluno1.setNome("Ana Carolina");
        aluno1.setIdade(23);
        aluno1.setMatricula(1234);
        Aluno aluno2 =  new Aluno("Marcos Vinicius",21,5641);
        Aluno aluno3 =  new Aluno("Luiz Carlos",25,4781);
        Aluno aluno4 =  new Aluno("Maria Eduarda ",18,6145);
        Aluno aluno5 =  new Aluno("João Antonio",27,4165);
        Turma turma1 = new Turma("Turma A",01);
        Turma turma2 = new Turma("Turma B",02);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma2.adicionarAluno(aluno4);
        turma2.adicionarAluno(aluno5);

        turma1.listarAlunos();
        turma2.listarAlunos();

    }
}
