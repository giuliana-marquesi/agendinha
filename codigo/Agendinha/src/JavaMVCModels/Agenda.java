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

    private void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    private void setDono(String novoDono) {
        this.dono = novoDono;
    }
    
    private void setTipo(String novoTipo) {
        this.tipo = novoTipo;
    }

    private String getNome() {
        return this.nome;
    }

    private String getDono(){
        return this.dono;
    }

    private String getTipo() {
        return this.tipo;
    }
   
}
