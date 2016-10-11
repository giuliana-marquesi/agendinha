/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;
import java.util.Date;
import JavaMVCViews.*;
import JavaMVCModels.*;
/**
 *
 * @author vinicius e gigik-adm
 */
public class LembreteController {
    public Lembrete createLembrete(Date data, String descricao) {
        Lembrete novoLembrete = new Lembrete(data, descricao);
        return novoLembrete;
    }
    
    public String readLembrete(Lembrete lembrete) {
        String data = lembrete.getData().toString();
        String descricao = lembrete.getDescricao();
        return data + " " + descricao;
    }

    public boolean updateLembrete(Lembrete lembrete, Date data, String descricao) {        
        if(data != null && descricao != null) {
            lembrete.setDate(data);
            lembrete.setDescricao(descricao);            
            return true;
        }        
        return false;
    }    
}
