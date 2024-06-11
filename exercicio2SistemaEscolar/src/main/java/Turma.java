import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;
    private String nomeTurma;
    private int codigo;

    public Turma(String nomeTurma, int codigo) {
        this.nomeTurma = nomeTurma;
        this.codigo = codigo;
        this.alunos = new ArrayList<Aluno>();
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("\n----- Alunos da " + nomeTurma + " Código da turma: " + codigo+ " -----");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

}
