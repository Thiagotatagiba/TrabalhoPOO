/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.util.Scanner;

public class TurmaView {
    private static Scanner entrada = new Scanner(System.in);
	private TurmaDao turmaDao;
	
	public TurmaDao (TurmaDao turmaDao){
		this.turmaDao = turmaDao;
	}
	
	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		TurmaView.entrada = entrada;
	}
    
   /* Dao<Aluno> dao;
    public AlunoView(Dao,dao){
        this.dao = dao;*/
    }
     
 
    public void cadastrar(){
        System.out.println("Cadastro de Aluno");
        System.out.println("Informe o nome: ");
        String aluno = entrada.nextLine();
	//while (verificacoes.verificarStringVazia(nome) || verificacoes.verificarStringSoNumeros(nome)){
	//	System.out.println("Nome do aluno nao aceito, digite o nome do aluno novamente: ");
	//	nome = entrada.nextLine();
	}
        System.out.println("Digite o CPF: ");
	String cpf = entrada.nextLine();
	//while (verificacoes.verificarCpf(cpf) == false){
        //    System.out.println("CPF invalido, digite o CPF novamente: ");
	//	cpf = entrada.nextLine();
        System.out.println("Digite o local: ");
	String local = entrada.nextLine();
	}
	if (AlunoDao.verificar(cpf) != null){
		System.out.println("Aluno ja estava cadastrado!");
		return;
	}
        String cpf = scan.nextLine();
        Aluno aluno = new Aluno(nome,cpf);
        scan.close();
   
        dao.salvar(turma);
    }
    
    public void listar(){

        List<Aluno> listaAluno = dao.obterTodos();
        
        for(Aluno aluno : listaAluno){
            System.out.println(turma.getNome()+ " " + aluno.getCpf());
        }
        
    }
    public void pesquisar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o cpf:");
        
    }
}
