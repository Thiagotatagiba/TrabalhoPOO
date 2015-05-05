/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo.model.pojo;

/**
 *
 * @author Amanda
 */
public class Turma {
    private int ano;
    private int período;
    private String local;
    private String horario;
    private int numero_de_vagas;

    public Turma(int ano, int período, String local, String horario, int numero_de_vagas) {
        this.ano = ano;
        this.período = período;
        this.local = local;
        this.horario = horario;
        this.numero_de_vagas = numero_de_vagas;
    }
    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getPeríodo() {
        return período;
    }

    public void setPeríodo(int período) {
        this.período = período;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHoriario(String horario) {
        this.horario = horario;
    }

    public int getNumero_de_vagas() {
        return numero_de_vagas;
    }

    public void setNumero_de_vagas(int numero_de_vagas) {
        this.numero_de_vagas = numero_de_vagas;
    }
    
}
