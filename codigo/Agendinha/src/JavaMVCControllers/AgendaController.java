/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;

import java.util.Date;
import JavaMVCModels.*;
import JavaMVCControllers.*;

/**
 *
 * @author vinicius gigik-adm
 */
public class AgendaController {
    LembreteController ctrlLembrete = new LembreteController();
    public Agenda createAgenda(String nome, String dono, String tipo) {
        Agenda agendinha = new Agenda(nome,dono,tipo);
        return agendinha;
    };
    
    public String readAgenda(Agenda agendinha) {
        String mensagem = agendinha.getNome() + " " + agendinha.getDono() + " " + agendinha.getTipo() + "\n";
        for(Lembrete lembrete : agendinha.getLembretes()) {
            mensagem += ctrlLembrete.readLembrete(lembrete) + "\n ";
        }
        return mensagem;
    };
    
    public void updateAgenda() {
        //aqui só precisa fazer o update dos atributos da agenda
    };    
    
    //Controller Dono
        public void addAgenda() {
            
        };

        public void deleteAgenda() {
            
        };
    
    public void addLembrete(Date data, String Descricao) {
        //criar lembrete e colocar no array
    };
    
    public void deleteAllLembretes(Agenda agendinha) {
        //usar getLembretes pra zerar o arraylist
    };
    
    public void deleteLembrete(Agenda agendinha) {
        //como dar 'free' numa instancia?
        //Se um objeto é instanciado num metódo morre junto com o método? 
        //
    };
}
