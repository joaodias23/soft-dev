package EX3;

public class DisciplinaCurso {
    Disciplina disciplina;
    Professor professor;

    public DisciplinaCurso(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Disciplina getDisciplina(){
        return disciplina;
    }

    public Professor getProfessor(){
        return professor;
    }
}
