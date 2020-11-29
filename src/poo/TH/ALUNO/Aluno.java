package poo.TH.ALUNO;

public class Aluno {

	private String matricula, nome;
	private int curso;

	public Aluno(String matricula) {
		this(matricula, null);
	}
	
	public Aluno(String matricula, String nome) {
		this(matricula, nome, 0);
	}

	public Aluno(String matricula, String nome, int curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
}