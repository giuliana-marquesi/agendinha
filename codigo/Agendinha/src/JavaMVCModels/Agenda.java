/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCModels;
import java.util.ArrayList;

/**
 *
 * @author vinicius e gigik-adm
 */
public class Agenda {
    private String nome;
    private String dono;
    private String tipo;
    private ArrayList<Lembrete> lembretes;
    
    public Agenda(String nome, String dono, String tipo) {
        this.nome = nome;
        this.dono = dono;
        this.tipo = tipo;
        this.lembretes = new ArrayList<Lembrete>();     
    }
    
    public ArrayList<Lembrete> getLembretes() {
        return this.lembretes;
    }
    
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    public void setDono(String novoDono) {
        this.dono = novoDono;
    }
    
    public void setTipo(String novoTipo) {
        this.tipo = novoTipo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDono(){
        return this.dono;
    }

    public String getTipo() {
        return this.tipo;
    }
   
}
