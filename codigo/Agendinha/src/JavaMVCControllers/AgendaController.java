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
    
    public boolean updateAgenda(Agenda agendinha, String nome, String dono, String tipo) {
        if(nome != null && dono != null && tipo != null) {
            agendinha.setDono(dono);
            agendinha.setNome(nome);
            agendinha.setTipo(tipo);
            return true;
        }
        return false;
        //aqui só precisa fazer o update dos atributos da agenda
    };    
    
    public void adicionaLembrete(Agenda agendinha, Date data, String Descricao) {
        Lembrete novoLembrete = ctrlLembrete.createLembrete(data, Descricao);
        agendinha.addLembrete(novoLembrete);
        //criar lembrete e colocar no array
    };
    
    public Lembrete buscaDeLembrete(Agenda agendinha, String descricao) {        
        Lembrete outroLembrete = null;
        for(Lembrete lembrete : agendinha.getLembretes()) {
            String decLembrete = lembrete.getDescricao();
            if(decLembrete.contains(descricao)) {        
                outroLembrete = lembrete;                
            } 
        }
        return outroLembrete;
    }    
    
    public void deleteAllLembretes(Agenda agendinha) {
        agendinha.getLembretes().clear();
    };
    
    public void deleteLembrete(Agenda agendinha, Lembrete lembrete) {
        agendinha.getLembretes().remove(lembrete);    
    };
}
