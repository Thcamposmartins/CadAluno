package poo.TH.ALUNO;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static Scanner in = new Scanner(System.in);
	private static ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	public static void main(String[] args) {
		  		

		int sair = 0;
		do {
			  System.out.println("------------------------------------------------------------");
			  System.out.println("1 - Criar um novo Aluno");
			  System.out.println("2 - Editar um Aluno");
			  System.out.println("3 - Excluir um  Aluno");
			  System.out.println("4 - Listar todos os Alunos");
			  System.out.println("5 - Sair");
			  System.out.println("------------------------------------------------------------");
			  int num = in.nextInt();
			  switch (num) {
			     case 1:
			       System.out.println("Você escolheu 1 - Criar um novo Aluno");
			       criarAluno();
			       break;
			     case 2:
			       System.out.println("Você escolheu 2 - Editar um Aluno");
			       editarAluno();
			       break;
			     case 3:
			       System.out.println("Você escolheu 3 - Excluir um  Aluno");
			       excluirAluno();
			       break;
			     case 4:
			       System.out.println("Você escolheu 4 - Listar todos os Alunos");
			       printAluno();
			       break;
			     default:
			       System.out.println("Número inválido");
			  }

			if(num==5) {sair = 5;}
		} while (sair!=5);
		
	}
	/*criar um novo aluno*/
	 public static void criarAluno(){
		System.out.println("Digite sua matrícula>> ");
		String matricula = in.next();
		System.out.println("Digite seu Nome>> ");
		String nome =  in.next();
		System.out.println("Digite o COD do seu curso com 3 digitos>> ");
		int curso =  in.nextInt();

		Aluno aluno = new Aluno(matricula, nome, curso);		
		System.out.println("Aluno cadastrado com sucesso!");
		alunos.add(aluno);
	}
	//editar um aluno
	 public static void editarAluno() {
			System.out.println("Digite sua matrícula>> ");
			String matricula = in.next();
			for(Aluno aluno: alunos)
			{		
			System.out.println("Digite sua matrícula>> ");			
			aluno.setMatricula(in.next());
			System.out.println("Digite seu Nome>> ");
			aluno.setNome(in.next());
			System.out.println("Digite o COD do seu curso com 3 digitos>> ");
			aluno.setCurso(in.nextInt()); 
			}}
			
	
	//excluir aluno
		public static void excluirAluno() {
			System.out.println("Digite sua matrícula>> ");
			String matricula = in.next();
		    alunos.removeIf(aluno->matricula==aluno.getMatricula());		
		}
	
		//listar alunos
		public static void printAluno(){
			System.out.println("--------------------------------------------------------");
			for(Aluno aluno: alunos)
			{
				System.out.println("Nome>>  " + aluno.getNome()+"    Matricula>>  " + aluno.getMatricula()+"   Curso>>" + aluno.getCurso());
				System.out.println("--------------------------------------------------------");
			}
		}
		
	}


