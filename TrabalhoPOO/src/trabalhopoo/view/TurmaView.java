/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.util.Scanner
        
public class TurmaView {
    private static Scanner entrada = new Scanner(System.in);
	private TurmaDao turmaDao;
	
	public TurmaView (TurmaDao turmaDao){
		this.turmaDao = turmaDao;
	}
	
	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		TurmaView.entrada = entrada;
	}
     public void cadastrar(){
        System.out.println("Cadastro de Turma");
        System.out.println("Informe o ano: ");
        int ano = entrada.nextLine();
	//while (verificacoes.verificarStringVazia(nome) || verificacoes.verificarStringSoNumeros(nome)){
	//	System.out.println("Nome do aluno nao aceito, digite o nome do aluno novamente: ");
	//	nome = entrada.nextLine();}
        System.out.println("Digite o período: ");
	int período = entrada.nextLine();
	//while (verificacoes.verificarCpf(cpf) == false){
        //    System.out.println("CPF invalido, digite o CPF novamente: ");
	//	cpf = entrada.nextLine();}
        System.out.println("Digite o local: ");
	String local = entrada.nextLine();
        
        System.out.println("Digite o horário: ");
	String horário = entrada.nextLine();
        
        System.out.println("Digite o numero de vagas: ");
	int numero_de_vagas = entrada.nextLine();
	}
	if (AlunoDao.verificar(cpf) != null){
		System.out.println("Aluno ja estava cadastrado!");
		return;
	}
        String cpf = scan.nextLine();
        Turma turma = new Turma(ano,período,local,horário,numero_de_vagas);
        scan.close();
   
        dao.salvar(turma);
    }
    
    public void listar(){

        List<Turma> listaTurma = dao.obterTodos();
        
        for(Turma turma : listaTurma){
            System.out.println(turma.getAno()+ " " + turma.getPeríodo() + " " 
            + turma.getLocal() + " " + turma.getHorário() + " " +
            turma.getNumero_de_vagas());
        }
        
    }
    public void pesquisar(){
        Scanner scan = new Scanner(System.in);
      //  System.out.println("Informe o cpf:");
        
    }
}
