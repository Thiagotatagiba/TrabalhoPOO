/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.view;

import java.util.Scanner
        
/**
 *
 * @author Amanda
 */
public class TurmaView {
    private static Scanner entrada = new Scanner(System.in);
	private AlunoDao alunoDao;
	
	public AlunoView (AlunoDao alunoDao){
		this.alunoDao = alunoDao;
	}
	
	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		AlunoView.entrada = entrada;
	}
    
}
