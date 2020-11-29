package poo.TH.ALUNO;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	private static ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	public static void main(String[] args) {
		  		

		int sair = 0;
		do {
			  System.out.println("----------------------------------------");
			  System.out.println("1 - Criar um novo Aluno");
			  System.out.println("2 - Editar um Aluno");
			  System.out.println("3 - Excluir um  Aluno");
			  System.out.println("4 - Listar todos os Alunos");
			  System.out.println("5 - Sair");
			  System.out.println("----------------------------------------");
			  int num = in.nextInt();
			  switch (num) {
			     case 1:
			       System.out.println("Você escolheu 1");
			       break;
			     case 2:
			       System.out.println("Você escolheu 2");
			       break;
			     case 3:
			       System.out.println("Você escolheu 3");
			       break;
			     case 4:
			       System.out.println("Você escolheu 4");
			       break;
			     default:
			       System.out.println("Número inválido");
			  }

			if(num==5) {sair = 1;}
		} while (sair!=1);
		
	}
	//criar um novo aluno
	 public void criarAluno(){
		System.out.println("Digite sua matrícula>> ");
		String matricula = in.next();
		System.out.println("Digite seu Nome>> ");
		String nome =  in.next();
		System.out.println("Digite o COD do seu curso com 3 digitos>> ");
		int curso =  in.nextInt();

		Aluno aluno = new Aluno(matricula, nome, curso);

		System.out.println("Aluno cadastrado com sucesso!");
	}
	//editar um aluno
	//listar alunos
	//excluir aluno
		public void excluirAluno() {
			System.out.println("Digite sua matrícula>> ");
			String matricula = in.next();
			Aluno alunook =pesquisaMatricula(matricula);			
			
			if (alunook == null) {
				System.out.println("Aluno não encontrado!");
			}
			else {
				Aluno alunoParaRemover = new Aluno(matricula);
				
				aluno.remove(alunoParaRemover);
			}
		}
		public Aluno pesquisaMatricula(String matricula){
			Aluno resultado = null;
			Aluno alunook;
			for (int i = 0; i < aluno.size(); i++) {
				Aluno atual = aluno.get(i);
				
				if (atual.getMatricula().equals(matricula)) {
					resultado = atual;
					break;
				}
			return alunook = resultado;
			}
		}
	}


